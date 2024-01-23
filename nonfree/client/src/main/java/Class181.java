import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class181 {

	@OriginalMember(owner = "client!un", name = "c", descriptor = "I")
	private int anInt5669;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "Lclient!sc;")
	private Class2_Sub8_Sub1_Sub1 aClass2_Sub8_Sub1_Sub1_5;

	@OriginalMember(owner = "client!un", name = "f", descriptor = "I")
	private int anInt5670;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "I")
	private int anInt5667 = -1;

	@OriginalMember(owner = "client!un", name = "k", descriptor = "I")
	private int anInt5673;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "I")
	private int anInt5672;

	@OriginalMember(owner = "client!un", name = "b", descriptor = "I")
	private int anInt5668;

	@OriginalMember(owner = "client!un", name = "h", descriptor = "I")
	private int anInt5671;

	@OriginalMember(owner = "client!un", name = "l", descriptor = "[Lclient!ah;")
	private Class8[] aClass8Array2;

	@OriginalMember(owner = "client!un", name = "j", descriptor = "[Lclient!ah;")
	private Class8[] aClass8Array1;

	@OriginalMember(owner = "client!un", name = "g", descriptor = "Lclient!ah;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(I[Lclient!ah;IIII)V")
	public Class181(@OriginalArg(0) int arg0, @OriginalArg(1) Class8[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5673 = arg3;
		this.anInt5672 = arg4;
		this.anInt5668 = arg5;
		this.anInt5671 = arg0;
		this.aClass8Array2 = arg1;
		if (arg1 == null) {
			this.aClass8Array1 = null;
			this.aClass8_1 = null;
		} else {
			this.aClass8Array1 = new Class8[arg1.length];
			this.aClass8_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIIII)V")
	public void method4481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method4484(arg4);
		@Pc(8) int local8 = arg6 + arg0 & 0x7FF;
		@Pc(47) int local47;
		if (this.anInt5671 == -1) {
			Static77.method1447(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass2_Sub8_Sub1_Sub1_5 == null) {
				this.aClass2_Sub8_Sub1_Sub1_5 = Static1.anInterface3_1.method4139(this.anInt5669, this.anInt5671, Static1.aFloat1, false);
			}
			if (!Static1.anInterface3_1.method4145(this.anInt5671)) {
				Static77.method1447(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass2_Sub8_Sub1_Sub1_5 != null) {
				local47 = arg5 * arg4 / -512;
				@Pc(59) int local59;
				for (local59 = (arg3 - arg4) / 2 + local8 * arg4 / 512; local59 > arg4; local59 -= arg4) {
				}
				while (local59 < 0) {
					local59 += arg4;
				}
				while (local47 > arg4) {
					local47 -= arg4;
				}
				while (local47 < 0) {
					local47 += arg4;
				}
				for (@Pc(93) int local93 = local59 - arg4; local93 < arg3; local93 += arg4) {
					for (@Pc(100) int local100 = local47 - arg4; local100 < arg4; local100 += arg4) {
						this.aClass2_Sub8_Sub1_Sub1_5.method4365(local93 + arg1, local100 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (local47 = this.anInt5670 - 1; local47 >= 0; local47--) {
			this.aClass8Array1[local47].method131(arg1, arg2, arg3, arg4, arg5, local8, this.aClass8_1);
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(IIIIIIII)V")
	public void method4482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static116.aGL1;
		this.method4484(arg4);
		@Pc(10) int local10 = arg6 + arg0 & 0x7FF;
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 + arg4;
		Static116.method1954(false);
		Static116.method1974(false);
		Static116.method1963(false);
		Static116.method1960();
		Static116.method1948(arg1, local14, arg2, local18);
		Static116.method1947();
		@Pc(36) int local36;
		for (local36 = this.anInt5670 - 1; local36 >= 0; local36--) {
			this.aClass8Array1[local36].method142(this.aClass8_1);
		}
		if (this.anInt5671 == -1) {
			Static116.method1955(arg7);
		} else {
			if (!Static1.anInterface3_1.method4145(this.anInt5671)) {
				Static116.method1955(arg7);
			}
			Static1.anInterface3_1.method4133(this.anInt5671, this.anInt5669);
			@Pc(71) float local71 = (float) arg5 / 512.0F;
			@Pc(76) float local76 = (float) local10 / -512.0F;
			@Pc(86) float local86 = (float) (arg3 - arg4) / ((float) arg4 * 2.0F);
			local1.glBegin(7);
			local1.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			local1.glTexCoord2f(local76 - local86, local71);
			local1.glVertex2i(arg1, arg2);
			local1.glTexCoord2f(local76 - local86, local71 + 1.0F);
			local1.glVertex2i(arg1, local18);
			local1.glTexCoord2f(local86 + local76 + 1.0F, local71 + 1.0F);
			local1.glVertex2i(local14, local18);
			local1.glTexCoord2f(local86 + local76 + 1.0F, local71);
			local1.glVertex2i(local14, arg2);
			local1.glEnd();
		}
		for (local36 = this.anInt5670 - 1; local36 >= 0; local36--) {
			this.aClass8Array1[local36].method136(arg1, arg2, arg3, arg4, arg5, local10);
		}
		Static116.method1958();
		Static116.method1963(true);
		Static116.method1974(true);
		Static116.method1954(true);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	private void method4484(@OriginalArg(0) int arg0) {
		if (this.anInt5667 == arg0) {
			return;
		}
		this.anInt5667 = arg0;
		@Pc(10) int local10 = Static295.method4523(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt5669) {
			this.anInt5669 = local10;
			this.aClass2_Sub8_Sub1_Sub1_5 = null;
		}
		if (this.aClass8Array2 == null) {
			return;
		}
		this.anInt5670 = 0;
		@Pc(36) int[] local36 = new int[this.aClass8Array2.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass8Array2.length; local38++) {
			@Pc(48) Class8 local48 = this.aClass8Array2[local38];
			if (local48.method134(this.anInt5673, this.anInt5672, this.anInt5668, this.anInt5667)) {
				local36[this.anInt5670] = local48.anInt125;
				this.aClass8Array1[this.anInt5670++] = local48;
			}
		}
		Static143.method2547(this.aClass8Array1, local36, 0, this.anInt5670 - 1);
	}
}
