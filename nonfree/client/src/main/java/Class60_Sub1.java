import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public abstract class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
	protected int anInt6841;

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "[I")
	private int[] anIntArray541;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
	protected int anInt6844;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
	protected int anInt6846;

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
	protected int anInt6863;

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "Lclient!hm;")
	protected final Class92_Sub1 aClass92_Sub1_11;

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
	protected final int anInt6854;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
	protected final int anInt6835;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!hm;II)V")
	protected Class60_Sub1(@OriginalArg(0) Class92_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass92_Sub1_11 = arg0;
		this.anInt6854 = arg1;
		this.anInt6835 = arg2;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "()I")
	@Override
	public final int method5691() {
		return this.anInt6863 + this.anInt6835 + this.anInt6841;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(FFFFFFLclient!go;II)V")
	@Override
	protected final void method5678(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class84 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass92_Sub1_11.method2348()) {
			throw new IllegalStateException();
		}
		this.method5697(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class84_Sub1 local18 = (Class84_Sub1) arg6;
		this.method5696(local18.anIntArray480, local18.anIntArray481, Static70.anInt6848 - arg7, -arg8 - (Static70.anInt6843 - Static70.anInt6840));
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V")
	protected abstract void method5695(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "()I")
	@Override
	public final int method5679() {
		return this.anInt6854;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)V")
	public abstract void method5682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method5680(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass92_Sub1_11.method2348()) {
			throw new IllegalStateException();
		}
		this.method5697(arg0, arg1, arg2, arg3, arg4, arg5);
		Static70.anInt6839 = arg7;
		if (arg6 != 0) {
			Static70.anInt6838 = arg7 >>> 24;
			Static70.anInt6851 = 256 - Static70.anInt6838;
			if (arg6 == 1) {
				Static70.anInt6860 = arg7 >> 16 & 0xFF;
				Static70.anInt6836 = arg7 >> 8 & 0xFF;
				Static70.anInt6842 = arg7 & 0xFF;
			} else {
				Static70.anInt6847 = arg7 >>> 24;
				Static70.anInt6845 = 256 - Static70.anInt6847;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static70.anInt6845 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static70.anInt6845 & 0xFF0000;
				Static70.anInt6858 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method5695(0);
		} else if (arg6 == 1) {
			this.method5695(1);
		} else if (arg6 == 2) {
			this.method5695(2);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!go;II)V")
	public abstract void method5686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "()I")
	@Override
	public final int method5683() {
		return this.anInt6846 + this.anInt6854 + this.anInt6844;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method5689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass92_Sub1_11.method2348()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray541 == null) {
			this.anIntArray541 = new int[4];
		}
		this.aClass92_Sub1_11.method4525(this.anIntArray541);
		this.aClass92_Sub1_11.method4472(this.aClass92_Sub1_11.anInt2631, this.aClass92_Sub1_11.anInt2634, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5683();
		@Pc(40) int local40 = this.method5691();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5682(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass92_Sub1_11.method4459(this.anIntArray541[0], this.anIntArray541[1], this.anIntArray541[2], this.anIntArray541[3]);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method5690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6846 = arg0;
		this.anInt6863 = arg1;
		this.anInt6844 = arg2;
		this.anInt6841 = arg3;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "()I")
	@Override
	public final int method5687() {
		return this.anInt6835;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([I[III)V")
	protected abstract void method5696(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(FFFFFF)V")
	private void method5697(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6846 + this.anInt6854 + this.anInt6844;
		@Pc(17) int local17 = this.anInt6863 + this.anInt6835 + this.anInt6841;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6854 || local17 != this.anInt6835) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6863;
			local65 = local53 * (float) this.anInt6863;
			local71 = local32 * (float) this.anInt6846;
			local77 = local39 * (float) this.anInt6846;
			@Pc(84) float local84 = -local32 * (float) this.anInt6844;
			@Pc(91) float local91 = -local39 * (float) this.anInt6844;
			@Pc(98) float local98 = -local46 * (float) this.anInt6841;
			@Pc(105) float local105 = -local53 * (float) this.anInt6841;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + arg2 - arg0;
		local39 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) this.aClass92_Sub1_11.anInt2631) {
			local46 = this.aClass92_Sub1_11.anInt2631;
		}
		if (local53 > (float) this.aClass92_Sub1_11.anInt2633) {
			local53 = this.aClass92_Sub1_11.anInt2633;
		}
		if (local59 < (float) this.aClass92_Sub1_11.anInt2634) {
			local59 = this.aClass92_Sub1_11.anInt2634;
		}
		if (local65 > (float) this.aClass92_Sub1_11.anInt2606) {
			local65 = this.aClass92_Sub1_11.anInt2606;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static70.anInt6849 = this.aClass92_Sub1_11.anInt2605;
		Static70.anInt6862 = (int) ((float) ((int) local59 * Static70.anInt6849) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static70.anInt6837 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6854 / local71);
		Static70.anInt6852 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6835 / local77);
		Static70.anInt6864 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6854 / local77);
		Static70.anInt6853 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6835 / local71);
		Static70.anInt6857 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static70.anInt6855 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static70.anInt6834 = (this.anInt6854 >> 1 << 12) + (Static70.anInt6855 * Static70.anInt6864 >> 4);
		Static70.anInt6859 = (this.anInt6835 >> 1 << 12) + (Static70.anInt6855 * Static70.anInt6853 >> 4);
		Static70.anInt6850 = Static70.anInt6857 * Static70.anInt6837 >> 4;
		Static70.anInt6861 = Static70.anInt6857 * Static70.anInt6852 >> 4;
		Static70.anInt6848 = (int) local46;
		Static70.anInt6856 = (int) local53;
		Static70.anInt6840 = (int) local59;
		Static70.anInt6843 = (int) local65;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);
}
