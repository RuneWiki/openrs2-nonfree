import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public final class Class40_Sub3_Sub1 extends Class40_Sub3 {

	@OriginalMember(owner = "client!ot", name = "Q", descriptor = "Z")
	public final boolean aBoolean548;

	@OriginalMember(owner = "client!ot", name = "M", descriptor = "F")
	public final float aFloat161;

	@OriginalMember(owner = "client!ot", name = "S", descriptor = "F")
	public final float aFloat162;

	@OriginalMember(owner = "client!ot", name = "N", descriptor = "I")
	public final int anInt6748;

	@OriginalMember(owner = "client!ot", name = "R", descriptor = "I")
	public final int anInt6751;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!ok;IIII)V")
	public Class40_Sub3_Sub1(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt7362 == 34037) {
			this.aBoolean548 = false;
			this.aFloat161 = arg3;
			this.aFloat162 = arg4;
		} else {
			this.aFloat161 = this.aFloat162 = 1.0F;
			this.aBoolean548 = true;
		}
		this.anInt6748 = arg4;
		this.anInt6751 = arg3;
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!ok;IIIIZ[BI)V")
	public Class40_Sub3_Sub1(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt7362 == 34037) {
			this.aFloat161 = arg3;
			this.aBoolean548 = false;
			this.aFloat162 = arg4;
		} else {
			this.aBoolean548 = true;
			this.aFloat161 = this.aFloat162 = 1.0F;
		}
		this.anInt6748 = arg4;
		this.anInt6751 = arg3;
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!ok;IIII[I)V")
	public Class40_Sub3_Sub1(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt6751 = arg1;
		this.anInt6748 = arg2;
		this.method5388(arg5, arg2, arg1);
		this.aFloat162 = (float) arg2 / (float) arg4;
		this.aBoolean548 = false;
		this.aFloat161 = (float) arg1 / (float) arg3;
		this.method5391(false, false);
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!ok;IIIIIIZ)V")
	public Class40_Sub3_Sub1(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean548 = false;
		this.anInt6751 = arg3;
		this.aFloat161 = (float) arg3 / (float) arg5;
		this.anInt6748 = arg4;
		this.aFloat162 = (float) arg4 / (float) arg6;
		this.method5391(false, false);
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!ok;IIIIIZ)V")
	public Class40_Sub3_Sub1(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt6748 = arg5;
		if (super.anInt7362 == 34037) {
			this.aFloat161 = arg4;
			this.aBoolean548 = false;
			this.aFloat162 = arg5;
		} else {
			this.aFloat161 = this.aFloat162 = 1.0F;
			this.aBoolean548 = true;
		}
		this.anInt6751 = arg4;
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!ok;IIIII[BI)V")
	public Class40_Sub3_Sub1(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt6751 = arg2;
		this.anInt6748 = arg3;
		this.method5387(arg6, arg2, true, arg7, arg3);
		this.aBoolean548 = false;
		this.aFloat161 = (float) arg2 / (float) arg4;
		this.aFloat162 = (float) arg3 / (float) arg5;
		this.method5391(false, false);
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!ok;IIIII)V")
	public Class40_Sub3_Sub1(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat162 = (float) arg3 / (float) arg5;
		this.aBoolean548 = false;
		this.anInt6748 = arg3;
		this.anInt6751 = arg2;
		this.aFloat161 = (float) arg2 / (float) arg4;
		this.method5391(false, false);
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!ok;IIIZ[I)V")
	public Class40_Sub3_Sub1(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt6748 = arg3;
		if (super.anInt7362 == 34037) {
			this.aFloat161 = arg2;
			this.aFloat162 = arg3;
			this.aBoolean548 = false;
		} else {
			this.aBoolean548 = true;
			this.aFloat161 = this.aFloat162 = 1.0F;
		}
		this.anInt6751 = arg2;
	}
}
