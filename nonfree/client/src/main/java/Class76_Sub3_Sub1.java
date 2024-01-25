import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class76_Sub3_Sub1 extends Class76_Sub3 {

	@OriginalMember(owner = "client!of", name = "L", descriptor = "I")
	public final int anInt7375;

	@OriginalMember(owner = "client!of", name = "F", descriptor = "I")
	public final int anInt7373;

	@OriginalMember(owner = "client!of", name = "J", descriptor = "F")
	public final float aFloat163;

	@OriginalMember(owner = "client!of", name = "I", descriptor = "F")
	public final float aFloat162;

	@OriginalMember(owner = "client!of", name = "G", descriptor = "Z")
	public final boolean aBoolean528;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!kw;IIIZ[III)V")
	public Class76_Sub3_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt7375 = arg2;
		this.anInt7373 = arg3;
		if (super.anInt9197 == 34037) {
			this.aFloat163 = arg3;
			this.aFloat162 = arg2;
			this.aBoolean528 = false;
		} else {
			this.aFloat162 = this.aFloat163 = 1.0F;
			this.aBoolean528 = true;
		}
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!kw;IIIII)V")
	public Class76_Sub3_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat163 = (float) arg3 / (float) arg5;
		this.anInt7373 = arg3;
		this.anInt7375 = arg2;
		this.aFloat162 = (float) arg2 / (float) arg4;
		this.aBoolean528 = false;
		this.method6412(false, false);
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!kw;IIIIIIZ)V")
	public Class76_Sub3_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat163 = (float) arg4 / (float) arg6;
		this.anInt7373 = arg4;
		this.anInt7375 = arg3;
		this.aBoolean528 = false;
		this.aFloat162 = (float) arg3 / (float) arg5;
		this.method6412(false, false);
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!kw;IIIII[BI)V")
	public Class76_Sub3_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt7375 = arg2;
		this.anInt7373 = arg3;
		this.method6408(arg6, arg2, arg7, arg3, true);
		this.aFloat162 = (float) arg2 / (float) arg4;
		this.aFloat163 = (float) arg3 / (float) arg5;
		this.aBoolean528 = false;
		this.method6412(false, false);
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!kw;IIIIIZ)V")
	public Class76_Sub3_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt9197 == 34037) {
			this.aBoolean528 = false;
			this.aFloat163 = arg5;
			this.aFloat162 = arg4;
		} else {
			this.aBoolean528 = true;
			this.aFloat162 = this.aFloat163 = 1.0F;
		}
		this.anInt7373 = arg5;
		this.anInt7375 = arg4;
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!kw;IIII[I)V")
	public Class76_Sub3_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt7373 = arg2;
		this.anInt7375 = arg1;
		this.method6411(arg1, arg2, arg5);
		this.aBoolean528 = false;
		this.aFloat163 = (float) arg2 / (float) arg4;
		this.aFloat162 = (float) arg1 / (float) arg3;
		this.method6412(false, false);
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!kw;IIII)V")
	public Class76_Sub3_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt9197 == 34037) {
			this.aBoolean528 = false;
			this.aFloat163 = arg4;
			this.aFloat162 = arg3;
		} else {
			this.aBoolean528 = true;
			this.aFloat162 = this.aFloat163 = 1.0F;
		}
		this.anInt7373 = arg4;
		this.anInt7375 = arg3;
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!kw;IIIIZ[BI)V")
	public Class76_Sub3_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt9197 == 34037) {
			this.aFloat162 = arg3;
			this.aBoolean528 = false;
			this.aFloat163 = arg4;
		} else {
			this.aFloat162 = this.aFloat163 = 1.0F;
			this.aBoolean528 = true;
		}
		this.anInt7373 = arg4;
		this.anInt7375 = arg3;
	}
}
