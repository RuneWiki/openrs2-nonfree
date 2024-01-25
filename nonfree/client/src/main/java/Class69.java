import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class69 {

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
	private int anInt2939 = 0;

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
	private int anInt2940 = 0;

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
	private int anInt2936 = 0;

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_13;

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "Lclient!dja;")
	private final Class65 aClass65_3;

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "[Lclient!kd;")
	private final Class16[] aClass16Array1;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "Lclient!ws;")
	public final Class16_Sub9 aClass16_Sub9_1;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class69(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass5_Sub1_13 = arg0;
		this.aClass65_3 = new Class65(arg0);
		this.aClass16Array1 = new Class16[10];
		this.aClass16Array1[1] = new Class16_Sub6(arg0);
		this.aClass16Array1[2] = new Class16_Sub3(arg0, this.aClass65_3);
		this.aClass16Array1[4] = new Class16_Sub1(arg0, this.aClass65_3);
		this.aClass16Array1[5] = new Class16_Sub7(arg0, this.aClass65_3);
		this.aClass16Array1[6] = new Class16_Sub5(arg0);
		this.aClass16Array1[7] = new Class16_Sub8(arg0);
		this.aClass16Array1[3] = this.aClass16_Sub9_1 = new Class16_Sub9(arg0);
		this.aClass16Array1[8] = new Class16_Sub4(arg0, this.aClass65_3);
		this.aClass16Array1[9] = new Class16_Sub2(arg0, this.aClass65_3);
		if (!this.aClass16Array1[8].method8759()) {
			this.aClass16Array1[8] = this.aClass16Array1[4];
		}
		if (!this.aClass16Array1[9].method8759()) {
			this.aClass16Array1[9] = this.aClass16Array1[8];
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)Z")
	public boolean method2483() {
		return this.aClass16Array1[3].method8759();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZZIIZI)V")
	public void method2484(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg1 & this.aClass5_Sub1_13.method6110();
		if (!local5 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg2 = arg3;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg0) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (this.anInt2939 != arg4) {
			if (this.anInt2939 != 0) {
				this.aClass16Array1[this.anInt2939 & Integer.MAX_VALUE].method8765();
			}
			if (arg4 != 0) {
				this.aClass16Array1[arg4 & Integer.MAX_VALUE].method8760(arg0);
				this.aClass16Array1[Integer.MAX_VALUE & arg4].method8763(arg0);
				this.aClass16Array1[Integer.MAX_VALUE & arg4].method8761(arg3, arg2);
			}
			this.anInt2936 = arg3;
			this.anInt2940 = arg2;
			this.anInt2939 = arg4;
		} else if (this.anInt2939 != 0) {
			this.aClass16Array1[Integer.MAX_VALUE & this.anInt2939].method8763(arg0);
			if (this.anInt2936 != arg3 || this.anInt2940 != arg2) {
				this.aClass16Array1[Integer.MAX_VALUE & this.anInt2939].method8761(arg3, arg2);
				this.anInt2940 = arg2;
				this.anInt2936 = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!cu;ZI)Z")
	public boolean method2485(@OriginalArg(0) Class2 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2939 == 0) {
			return false;
		} else {
			this.aClass16Array1[Integer.MAX_VALUE & this.anInt2939].method8762(arg0, arg1);
			return true;
		}
	}
}
