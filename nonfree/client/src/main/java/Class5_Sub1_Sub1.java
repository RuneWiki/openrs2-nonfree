import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 {

	@OriginalMember(owner = "client!we", name = "N", descriptor = "[J")
	public static final long[] aLongArray9;

	@OriginalMember(owner = "client!we", name = "H", descriptor = "Z")
	public final boolean aBoolean602;

	@OriginalMember(owner = "client!we", name = "J", descriptor = "I")
	public final int anInt7347;

	@OriginalMember(owner = "client!we", name = "O", descriptor = "F")
	public final float aFloat100;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "I")
	public final int anInt7346;

	@OriginalMember(owner = "client!we", name = "F", descriptor = "F")
	public final float aFloat98;

	static {
		new Class151("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
		aLongArray9 = new long[256];
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(14) long local14 = (long) local10;
			for (@Pc(16) int local16 = 0; local16 < 8; local16++) {
				if ((local14 & 0x1L) == 1L) {
					local14 = local14 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local14 >>>= 0x1;
				}
			}
			aLongArray9[local10] = local14;
		}
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!od;IIIIIIZ)V")
	public Class5_Sub1_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean602 = false;
		this.anInt7347 = arg3;
		this.aFloat100 = (float) arg4 / (float) arg6;
		this.anInt7346 = arg4;
		this.aFloat98 = (float) arg3 / (float) arg5;
		this.method5547(false, false);
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!od;IIIIZ[BI)V")
	public Class5_Sub1_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt7346 = arg4;
		if (super.anInt7321 == 34037) {
			this.aFloat98 = arg3;
			this.aBoolean602 = false;
			this.aFloat100 = arg4;
		} else {
			this.aBoolean602 = true;
			this.aFloat98 = this.aFloat100 = 1.0F;
		}
		this.anInt7347 = arg3;
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!od;IIIII[BI)V")
	public Class5_Sub1_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt7346 = arg3;
		this.anInt7347 = arg2;
		this.method5541(arg6, arg3, arg2, arg7, true);
		this.aFloat98 = (float) arg2 / (float) arg4;
		this.aBoolean602 = false;
		this.aFloat100 = (float) arg3 / (float) arg5;
		this.method5547(false, false);
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!od;IIIZ[I)V")
	public Class5_Sub1_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (super.anInt7321 == 34037) {
			this.aBoolean602 = false;
			this.aFloat98 = arg2;
			this.aFloat100 = arg3;
		} else {
			this.aBoolean602 = true;
			this.aFloat98 = this.aFloat100 = 1.0F;
		}
		this.anInt7347 = arg2;
		this.anInt7346 = arg3;
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!od;IIII[I)V")
	public Class5_Sub1_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt7346 = arg2;
		this.anInt7347 = arg1;
		this.method5545(arg2, arg5, arg1);
		this.aBoolean602 = false;
		this.aFloat100 = (float) arg2 / (float) arg4;
		this.aFloat98 = (float) arg1 / (float) arg3;
		this.method5547(false, false);
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!od;IIIIIZ)V")
	public Class5_Sub1_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt7321 == 34037) {
			this.aBoolean602 = false;
			this.aFloat98 = arg4;
			this.aFloat100 = arg5;
		} else {
			this.aBoolean602 = true;
			this.aFloat98 = this.aFloat100 = 1.0F;
		}
		this.anInt7347 = arg4;
		this.anInt7346 = arg5;
	}
}
