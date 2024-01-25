import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class162 {

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "[I")
	public static final int[] anIntArray213 = new int[256];

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
	private int anInt4262;

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "Lclient!faa;")
	private Class91 aClass91_15;

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "Lclient!faa;")
	public Class91 aClass91_16;

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "Ljava/lang/String;")
	private String aString48 = "null";

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(11) int local11 = local8;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray213[local8] = local11;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLclient!ac;)V")
	public void method3392(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7974();
			if (local5 == 0) {
				return;
			}
			this.method3398(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
	private void method3393() {
		this.aClass91_15 = new Class91(this.aClass91_16.method2270());
		for (@Pc(27) Class1_Sub44 local27 = (Class1_Sub44) this.aClass91_16.method2278(); local27 != null; local27 = (Class1_Sub44) this.aClass91_16.method2276()) {
			@Pc(38) Class1_Sub28 local38 = new Class1_Sub28(local27.aString91, (int) local27.aLong268);
			this.aClass91_15.method2269(Static415.method5893(local27.aString91), local38);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)I")
	public int method3394(@OriginalArg(0) int arg0) {
		if (this.aClass91_16 == null) {
			return this.anInt4262;
		} else {
			@Pc(22) Class1_Sub27 local22 = (Class1_Sub27) this.aClass91_16.method2271((long) arg0);
			return local22 == null ? this.anInt4262 : local22.anInt3348;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBLclient!ac;)V")
	private void method3398(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static313.method4655(arg1.method7963());
		} else if (arg0 == 2) {
			this.aChar4 = Static313.method4655(arg1.method7963());
		} else if (arg0 == 3) {
			this.aString48 = arg1.method7951();
		} else if (arg0 == 4) {
			this.anInt4262 = arg1.method7940();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(35) int local35 = arg1.method7945();
			this.aClass91_16 = new Class91(Static122.method2187(local35));
			for (@Pc(45) int local45 = 0; local45 < local35; local45++) {
				@Pc(51) int local51 = arg1.method7940();
				@Pc(63) Class1 local63;
				if (arg0 == 5) {
					local63 = new Class1_Sub44(arg1.method7951());
				} else {
					local63 = new Class1_Sub27(arg1.method7940());
				}
				this.aClass91_16.method2269((long) local51, local63);
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
	private void method3399() {
		this.aClass91_15 = new Class91(this.aClass91_16.method2270());
		for (@Pc(20) Class1_Sub27 local20 = (Class1_Sub27) this.aClass91_16.method2278(); local20 != null; local20 = (Class1_Sub27) this.aClass91_16.method2276()) {
			@Pc(29) Class1_Sub27 local29 = new Class1_Sub27((int) local20.aLong268);
			this.aClass91_15.method2269((long) local20.anInt3348, local29);
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)Z")
	public boolean method3401(@OriginalArg(0) int arg0) {
		if (this.aClass91_16 == null) {
			return false;
		}
		if (this.aClass91_15 == null) {
			this.method3399();
		}
		@Pc(26) Class1_Sub27 local26 = (Class1_Sub27) this.aClass91_15.method2271((long) arg0);
		return local26 != null;
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String method3402(@OriginalArg(1) int arg0) {
		if (this.aClass91_16 == null) {
			return this.aString48;
		} else {
			@Pc(22) Class1_Sub44 local22 = (Class1_Sub44) this.aClass91_16.method2271((long) arg0);
			return local22 == null ? this.aString48 : local22.aString91;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method3403(@OriginalArg(1) String arg0) {
		if (this.aClass91_16 == null) {
			return false;
		}
		if (this.aClass91_15 == null) {
			this.method3393();
		}
		for (@Pc(30) Class1_Sub28 local30 = (Class1_Sub28) this.aClass91_15.method2271(Static415.method5893(arg0)); local30 != null; local30 = (Class1_Sub28) this.aClass91_15.method2277()) {
			if (local30.aString37.equals(arg0)) {
				return true;
			}
		}
		return false;
	}
}
