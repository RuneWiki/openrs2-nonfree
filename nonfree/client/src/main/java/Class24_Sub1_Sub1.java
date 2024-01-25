import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class24_Sub1_Sub1 extends Class24_Sub1 {

	@OriginalMember(owner = "client!br", name = "K", descriptor = "Z")
	public final boolean aBoolean81;

	@OriginalMember(owner = "client!br", name = "O", descriptor = "F")
	public final float aFloat26;

	@OriginalMember(owner = "client!br", name = "M", descriptor = "F")
	public final float aFloat25;

	@OriginalMember(owner = "client!br", name = "H", descriptor = "I")
	public final int anInt990;

	@OriginalMember(owner = "client!br", name = "I", descriptor = "I")
	public final int anInt991;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!vj;IIII)V")
	public Class24_Sub1_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt3100 == 34037) {
			this.aBoolean81 = false;
			this.aFloat26 = arg4;
			this.aFloat25 = arg3;
		} else {
			this.aBoolean81 = true;
			this.aFloat25 = this.aFloat26 = 1.0F;
		}
		this.anInt990 = arg4;
		this.anInt991 = arg3;
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!vj;IIIIZ[BI)V")
	public Class24_Sub1_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt990 = arg4;
		if (super.anInt3100 == 34037) {
			this.aFloat25 = arg3;
			this.aFloat26 = arg4;
			this.aBoolean81 = false;
		} else {
			this.aBoolean81 = true;
			this.aFloat25 = this.aFloat26 = 1.0F;
		}
		this.anInt991 = arg3;
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!vj;IIIZ[I)V")
	public Class24_Sub1_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (super.anInt3100 == 34037) {
			this.aFloat26 = arg3;
			this.aFloat25 = arg2;
			this.aBoolean81 = false;
		} else {
			this.aBoolean81 = true;
			this.aFloat25 = this.aFloat26 = 1.0F;
		}
		this.anInt991 = arg2;
		this.anInt990 = arg3;
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!vj;IIII[I)V")
	public Class24_Sub1_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt991 = arg1;
		this.anInt990 = arg2;
		this.method823(arg2, arg1, arg5);
		this.aBoolean81 = false;
		this.aFloat25 = (float) arg1 / (float) arg3;
		this.aFloat26 = (float) arg2 / (float) arg4;
		this.method824(false, false);
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!vj;IIIIIZ)V")
	public Class24_Sub1_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt3100 == 34037) {
			this.aFloat25 = arg4;
			this.aFloat26 = arg5;
			this.aBoolean81 = false;
		} else {
			this.aBoolean81 = true;
			this.aFloat25 = this.aFloat26 = 1.0F;
		}
		this.anInt991 = arg4;
		this.anInt990 = arg5;
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!vj;IIIII[BI)V")
	public Class24_Sub1_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt991 = arg2;
		this.anInt990 = arg3;
		this.method825(true, arg3, arg2, arg6, arg7);
		this.aBoolean81 = false;
		this.aFloat25 = (float) arg2 / (float) arg4;
		this.aFloat26 = (float) arg3 / (float) arg5;
		this.method824(false, false);
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!vj;IIIII)V")
	public Class24_Sub1_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat25 = (float) arg2 / (float) arg4;
		this.aFloat26 = (float) arg3 / (float) arg5;
		this.aBoolean81 = false;
		this.anInt991 = arg2;
		this.anInt990 = arg3;
		this.method824(false, false);
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!vj;IIIIIIZ)V")
	public Class24_Sub1_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat26 = (float) arg4 / (float) arg6;
		this.anInt991 = arg3;
		this.aFloat25 = (float) arg3 / (float) arg5;
		this.anInt990 = arg4;
		this.aBoolean81 = false;
		this.method824(false, false);
	}
}
