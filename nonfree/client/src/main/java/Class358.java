import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class358 {

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
	private int anInt9342;

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
	private int anInt9343;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "Lclient!f;")
	private Class38 aClass38_41;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
	private int anInt9336 = -1;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Z")
	private boolean aBoolean776 = true;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	private final int anInt9341;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
	private final int anInt9337;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
	private final int anInt9339;

	@OriginalMember(owner = "client!wa", name = "u", descriptor = "[Lclient!fq;")
	private final Class114[] aClass114Array2;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
	private final int anInt9335;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "[Lclient!fq;")
	private final Class114[] aClass114Array1;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!fq;")
	private final Class114 aClass114_1;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I[Lclient!fq;IIII)V")
	public Class358(@OriginalArg(0) int arg0, @OriginalArg(1) Class114[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9341 = arg4;
		this.anInt9337 = arg5;
		this.anInt9339 = arg0;
		this.aClass114Array2 = arg1;
		this.anInt9335 = arg3;
		if (arg1 == null) {
			this.aClass114Array1 = null;
			this.aClass114_1 = null;
		} else {
			this.aClass114Array1 = new Class114[arg1.length];
			this.aClass114_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	public void method7469() {
		if (this.aClass114Array2 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass114Array2.length; local14++) {
				this.aClass114Array2[local14].method2091();
			}
		}
		this.aClass38_41 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BILclient!r;)Z")
	public boolean method7472(@OriginalArg(1) int arg0, @OriginalArg(2) Class162 arg1) {
		if (this.anInt9336 != arg0) {
			this.anInt9336 = arg0;
			@Pc(16) int local16 = Static511.method7273(arg0);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (local16 != this.anInt9342) {
				this.anInt9342 = local16;
				this.aClass38_41 = null;
			}
			if (this.aClass114Array2 != null) {
				this.anInt9343 = 0;
				@Pc(55) int[] local55 = new int[this.aClass114Array2.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass114Array2.length; local57++) {
					@Pc(64) Class114 local64 = this.aClass114Array2[local57];
					if (local64.method2096(this.anInt9335, this.anInt9341, this.anInt9337, this.anInt9336)) {
						local55[this.anInt9343] = local64.anInt2445;
						this.aClass114Array1[this.anInt9343++] = local64;
					}
				}
				Static233.method3327(0, this.aClass114Array1, this.anInt9343 - 1, local55);
			}
			this.aBoolean776 = true;
		}
		@Pc(117) boolean local117 = false;
		if (this.aBoolean776) {
			this.aBoolean776 = false;
			for (@Pc(128) int local128 = this.anInt9343 - 1; local128 >= 0; local128--) {
				@Pc(139) boolean local139 = this.aClass114Array1[local128].method2094(arg1, this.aClass114_1);
				local117 |= local139;
				this.aBoolean776 |= !local139;
			}
		}
		return local117;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIILclient!r;III)V")
	public void method7473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class162 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(13) int local13 = arg2 + arg0 & 0x3FFF;
		if (this.anInt9339 == -1 || this.anInt9342 == 0) {
			arg6.J(arg1, arg7, arg3, arg4, arg5, 0);
		} else {
			@Pc(35) Class291 local35 = Static579.anInterface9_12.method1074(this.anInt9339);
			if (this.aClass38_41 == null && Static579.anInterface9_12.method1073(this.anInt9339)) {
				@Pc(75) int[] local75 = local35.aBoolean599 ? Static579.anInterface9_12.method1075(this.anInt9342, this.anInt9342, 0.7F, this.anInt9339) : Static579.anInterface9_12.method1076(0.7F, this.anInt9342, false, this.anInt9342, this.anInt9339);
				this.aClass38_41 = arg6.method6879(local75, this.anInt9342, this.anInt9342, this.anInt9342);
			}
			if (local35.aBoolean599) {
				arg6.J(arg1, arg7, arg3, arg4, arg5, 0);
			}
			if (this.aClass38_41 != null) {
				@Pc(108) int local108 = local35.aBoolean599 ? 1 : 0;
				@Pc(114) int local114 = arg4 * arg8 / -4096;
				@Pc(127) int local127;
				for (local127 = arg4 * local13 / 4096 + (arg3 - arg4) / 2; local127 > arg4; local127 -= arg4) {
				}
				while (local127 < 0) {
					local127 += arg4;
				}
				while (local114 > arg4) {
					local114 -= arg4;
				}
				while (local114 < 0) {
					local114 += arg4;
				}
				for (@Pc(173) int local173 = local127 - arg4; local173 < arg3; local173 += arg4) {
					for (@Pc(180) int local180 = local114 - arg4; local180 < arg4; local180 += arg4) {
						this.aClass38_41.method7461(arg1 + local173, arg7 + local180, arg4, arg4, 1, 0, local108);
					}
				}
			}
		}
		for (@Pc(229) int local229 = this.anInt9343 - 1; local229 >= 0; local229--) {
			this.aClass114Array1[local229].method2092(arg6, arg1, arg7, arg3, arg4, arg8, local13);
		}
	}
}
