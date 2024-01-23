import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class3_Sub4_Sub4 extends Class3_Sub4 {

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "Lclient!cn;")
	private Class30 aClass30_6;

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "Lclient!cn;")
	public Class30 aClass30_7;

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "Ljava/lang/String;")
	private String aString34 = "null";

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!ug;I)V")
	private void method776(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static270.method4464(arg0.method3920());
		} else if (arg1 == 2) {
			this.aChar2 = Static270.method4464(arg0.method3920());
		} else if (arg1 == 3) {
			this.aString34 = arg0.method3931();
		} else if (arg1 == 4) {
			this.anInt937 = arg0.method3896();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(51) int local51 = arg0.method3948();
			this.aClass30_7 = new Class30(Static165.method2731(local51));
			for (@Pc(61) int local61 = 0; local61 < local51; local61++) {
				@Pc(72) int local72 = arg0.method3896();
				@Pc(84) Class3 local84;
				if (arg1 == 5) {
					local84 = new Class3_Sub28(arg0.method3931());
				} else {
					local84 = new Class3_Sub8(arg0.method3896());
				}
				this.aClass30_7.method668(local84, (long) local72);
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method777(@OriginalArg(1) int arg0) {
		if (this.aClass30_7 == null) {
			return this.aString34;
		} else {
			@Pc(26) Class3_Sub28 local26 = (Class3_Sub28) this.aClass30_7.method663((long) arg0);
			return local26 == null ? this.aString34 : local26.aString183;
		}
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
	private void method778() {
		this.aClass30_6 = new Class30(this.aClass30_7.method665());
		for (@Pc(28) Class3_Sub28 local28 = (Class3_Sub28) this.aClass30_7.method664(); local28 != null; local28 = (Class3_Sub28) this.aClass30_7.method671()) {
			@Pc(39) Class3_Sub30 local39 = new Class3_Sub30(local28.aString183, (int) local28.aLong243);
			this.aClass30_6.method668(local39, Static183.method3087(local28.aString183));
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ug;B)V")
	public void method780(@OriginalArg(0) Class3_Sub26 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3915();
			if (local11 == 0) {
				return;
			}
			this.method776(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)Z")
	public boolean method781(@OriginalArg(0) int arg0) {
		if (this.aClass30_7 == null) {
			return false;
		}
		if (this.aClass30_6 == null) {
			this.method786();
		}
		@Pc(23) Class3_Sub8 local23 = (Class3_Sub8) this.aClass30_6.method663((long) arg0);
		return local23 != null;
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(II)I")
	public int method783(@OriginalArg(1) int arg0) {
		if (this.aClass30_7 == null) {
			return this.anInt937;
		} else {
			@Pc(18) Class3_Sub8 local18 = (Class3_Sub8) this.aClass30_7.method663((long) arg0);
			return local18 == null ? this.anInt937 : local18.anInt1237;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method784(@OriginalArg(1) String arg0) {
		if (this.aClass30_7 == null) {
			return false;
		}
		if (this.aClass30_6 == null) {
			this.method778();
		}
		for (@Pc(33) Class3_Sub30 local33 = (Class3_Sub30) this.aClass30_6.method663(Static183.method3087(arg0)); local33 != null; local33 = (Class3_Sub30) this.aClass30_6.method670()) {
			if (local33.aString217.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
	private void method786() {
		this.aClass30_6 = new Class30(this.aClass30_7.method665());
		for (@Pc(28) Class3_Sub8 local28 = (Class3_Sub8) this.aClass30_7.method664(); local28 != null; local28 = (Class3_Sub8) this.aClass30_7.method671()) {
			@Pc(38) Class3_Sub8 local38 = new Class3_Sub8((int) local28.aLong243);
			this.aClass30_6.method668(local38, (long) local28.anInt1237);
		}
	}
}
