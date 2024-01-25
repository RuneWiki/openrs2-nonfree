import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class146 {

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
	private int anInt4418;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "Lclient!baa;")
	private Class25 aClass25_21;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "Lclient!baa;")
	public Class25 aClass25_22;

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "Ljava/lang/String;")
	private String aString29 = "null";

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)Z")
	public boolean method3760(@OriginalArg(1) int arg0) {
		if (this.aClass25_22 == null) {
			return false;
		}
		if (this.aClass25_21 == null) {
			this.method3769();
		}
		@Pc(27) Class3_Sub51 local27 = (Class3_Sub51) this.aClass25_21.method426((long) arg0);
		return local27 != null;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(BI)Ljava/lang/String;")
	public String method3761(@OriginalArg(1) int arg0) {
		if (this.aClass25_22 == null) {
			return this.aString29;
		} else {
			@Pc(25) Class3_Sub14 local25 = (Class3_Sub14) this.aClass25_22.method426((long) arg0);
			return local25 == null ? this.aString29 : local25.aString16;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	private void method3763() {
		this.aClass25_21 = new Class25(this.aClass25_22.method428());
		for (@Pc(24) Class3_Sub14 local24 = (Class3_Sub14) this.aClass25_22.method435(); local24 != null; local24 = (Class3_Sub14) this.aClass25_22.method432()) {
			@Pc(35) Class3_Sub29 local35 = new Class3_Sub29(local24.aString16, (int) local24.aLong277);
			this.aClass25_21.method434(Static360.method5787(local24.aString16), local35);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)I")
	public int method3764(@OriginalArg(0) int arg0) {
		if (this.aClass25_22 == null) {
			return this.anInt4418;
		} else {
			@Pc(23) Class3_Sub51 local23 = (Class3_Sub51) this.aClass25_22.method426((long) arg0);
			return local23 == null ? this.anInt4418 : local23.anInt9787;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!dc;)V")
	public void method3766(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5633();
			if (local5 == 0) {
				return;
			}
			this.method3767(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!dc;I)V")
	private void method3767(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub9 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static408.method6346(arg1.method5619());
		} else if (arg0 == 2) {
			this.aChar3 = Static408.method6346(arg1.method5619());
		} else if (arg0 == 3) {
			this.aString29 = arg1.method5607();
		} else if (arg0 == 4) {
			this.anInt4418 = arg1.method5585();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(42) int local42 = arg1.method5610();
			this.aClass25_22 = new Class25(Static533.method1203(local42));
			for (@Pc(52) int local52 = 0; local52 < local42; local52++) {
				@Pc(58) int local58 = arg1.method5585();
				@Pc(70) Class3 local70;
				if (arg0 == 5) {
					local70 = new Class3_Sub14(arg1.method5607());
				} else {
					local70 = new Class3_Sub51(arg1.method5585());
				}
				this.aClass25_22.method434((long) local58, local70);
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	private void method3769() {
		this.aClass25_21 = new Class25(this.aClass25_22.method428());
		for (@Pc(26) Class3_Sub51 local26 = (Class3_Sub51) this.aClass25_22.method435(); local26 != null; local26 = (Class3_Sub51) this.aClass25_22.method432()) {
			@Pc(35) Class3_Sub51 local35 = new Class3_Sub51((int) local26.aLong277);
			this.aClass25_21.method434((long) local26.anInt9787, local35);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method3770(@OriginalArg(0) String arg0) {
		if (this.aClass25_22 == null) {
			return false;
		}
		if (this.aClass25_21 == null) {
			this.method3763();
		}
		for (@Pc(31) Class3_Sub29 local31 = (Class3_Sub29) this.aClass25_21.method426(Static360.method5787(arg0)); local31 != null; local31 = (Class3_Sub29) this.aClass25_21.method429()) {
			if (local31.aString44.equals(arg0)) {
				return true;
			}
		}
		return false;
	}
}
