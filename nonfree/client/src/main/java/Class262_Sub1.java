import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.em;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class262_Sub1 extends Class262 implements Interface6 {

	@OriginalMember(owner = "client!pba", name = "g", descriptor = "Z")
	public boolean aBoolean530;

	@OriginalMember(owner = "client!pba", name = "j", descriptor = "Z")
	public boolean aBoolean531;

	@OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
	private final int anInt7430;

	@OriginalMember(owner = "client!pba", name = "f", descriptor = "I")
	private final int anInt7429;

	@OriginalMember(owner = "client!pba", name = "h", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!kfa;Lclient!iv;Lclient!jt;II)V")
	public Class262_Sub1(@OriginalArg(0) Class82_Sub3_Sub2 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass82_Sub3_Sub2_7.aBoolean425) {
			this.anInt7429 = arg4;
			this.anInt7430 = arg3;
		} else {
			this.anInt7430 = Static533.method1203(arg3);
			this.anInt7429 = Static533.method1203(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass82_Sub3_Sub2_7.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static293.method5042(this.aClass182_18, this.aClass168_13), 1);
	}

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!kfa;IIZ[III)V")
	public Class262_Sub1(@OriginalArg(0) Class82_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static95.aClass168_2, Static280.aClass182_8, arg3 && arg0.aBoolean427, arg1 * arg2);
		if (this.aClass82_Sub3_Sub2_7.aBoolean425) {
			this.anInt7430 = arg1;
			this.anInt7429 = arg2;
		} else {
			this.anInt7430 = Static533.method1203(arg1);
			this.anInt7429 = Static533.method1203(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass82_Sub3_Sub2_7.anIDirect3DDevice1.a(this.anInt7430, this.anInt7429, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass82_Sub3_Sub2_7.anIDirect3DDevice1.a(this.anInt7430, this.anInt7429, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass82_Sub3_Sub2_7.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (em.a(local82, (int) -1)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(95) int local95 = local71.getRowPitch();
			if (arg1 * 4 == local95 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(109) int local109 = 0; local109 < arg2; local109++) {
					local71.a(arg4, local109 * arg6 + arg5, local95 * local109, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!kfa;Lclient!iv;IIZ[BII)V")
	public Class262_Sub1(@OriginalArg(0) Class82_Sub3_Sub2 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static280.aClass182_8, arg4 && arg0.aBoolean427, arg3 * arg2);
		if (this.aClass82_Sub3_Sub2_7.aBoolean425) {
			this.anInt7429 = arg3;
			this.anInt7430 = arg2;
		} else {
			this.anInt7430 = Static533.method1203(arg2);
			this.anInt7429 = Static533.method1203(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass82_Sub3_Sub2_7.anIDirect3DDevice1.a(this.anInt7430, this.anInt7429, 0, 1024, Static293.method5042(Static280.aClass182_8, this.aClass168_13), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass82_Sub3_Sub2_7.anIDirect3DDevice1.a(this.anInt7430, this.anInt7429, 1, 0, Static293.method5042(Static280.aClass182_8, this.aClass168_13), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass82_Sub3_Sub2_7.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (em.a(local90, (int) -1)) {
			@Pc(106) int local106 = arg2 * this.aClass168_13.anInt4957;
			@Pc(112) int local112 = arg2 * this.aClass168_13.anInt4957;
			@Pc(115) int local115 = local79.getRowPitch();
			if (local115 == local112 && local106 == local112) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local112);
			} else {
				for (@Pc(136) int local136 = 0; local136 < arg3; local136++) {
					local79.a(arg5, local106 * local136 + arg6, local115 * local136, local112);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8506(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean531 = arg1;
		this.aBoolean530 = arg0;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IF)F")
	@Override
	public float method8503(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt7429;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)I")
	@Override
	public int method8501() {
		return this.anInt7430;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(FI)F")
	@Override
	public float method8502(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt7430;
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)I")
	@Override
	public int method8500() {
		return this.anInt7429;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(II[IIIIII)V")
	@Override
	public void method8507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (this.aClass168_13 != Static95.aClass168_2 || Static280.aClass182_8 != this.aClass182_18) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass82_Sub3_Sub2_7.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, arg5, arg3, arg4, arg1, 0, local16);
		if (!em.a(local33, (int) -1)) {
			return;
		}
		@Pc(40) int local40 = local16.getRowPitch();
		if (arg4 * 4 == local40 && arg4 == arg0) {
			local16.a((int[]) arg2, 0, 0, arg1 * arg4);
		} else {
			for (@Pc(54) int local54 = 0; local54 < arg1; local54++) {
				local16.a(arg2, arg0 * local54, local40 * local54, arg4);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8008() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8499() {
		return true;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!tha;B)V")
	@Override
	public void method8487(@OriginalArg(0) Class324 arg0) {
		super.method8487(arg0);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIILclient!iv;[BIIZI)V")
	@Override
	public void method8505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class168 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(8) int arg4) {
		if (this.aClass168_13 != arg2 || Static280.aClass182_8 != this.aClass182_18) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass82_Sub3_Sub2_7.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg4, 0, local16);
		if (!em.a(local27, (int) -1)) {
			return;
		}
		@Pc(38) int local38 = arg0 * this.aClass168_13.anInt4957;
		@Pc(44) int local44 = arg1 * this.aClass168_13.anInt4957;
		@Pc(47) int local47 = local16.getRowPitch();
		if (local47 == local44 && local44 == local38) {
			local16.a((byte[]) arg3, 0, 0, arg4 * local44);
		} else {
			for (@Pc(59) int local59 = 0; local59 < arg4; local59++) {
				local16.a(arg3, local59 * local38, local59 * local47, local44);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "(I)V")
	@Override
	public void method8488() {
		this.aClass82_Sub3_Sub2_7.method5052(this);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(III[IIII)V")
	@Override
	public void method8504(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(5) int arg2) {
		if (Static95.aClass168_2 != this.aClass168_13 || Static280.aClass182_8 != this.aClass182_18) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass82_Sub3_Sub2_7.aPixelBuffer1;
		@Pc(32) int local32 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg0, 16, local15);
		if (!em.a(local32, (int) -1)) {
			return;
		}
		@Pc(40) int local40 = local15.getRowPitch();
		if (local40 == arg2 * 4) {
			local15.b(arg1, 0, 0, arg1.length);
		} else {
			for (@Pc(55) int local55 = 0; local55 < arg0; local55++) {
				local15.b(arg1, local55 * arg2, local55 * local40, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}
}
