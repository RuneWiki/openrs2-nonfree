import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class169 implements Interface5 {

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "Lclient!hl;")
	private final Class101 aClass101_1 = new Class101(256);

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "Lclient!bu;")
	private final Class32 aClass32_60;

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "Lclient!bu;")
	private final Class32 aClass32_61;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "[Lclient!fg;")
	private final Class76[] aClass76Array1;

	static {
		new Class189("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!bu;Lclient!bu;Lclient!bu;)V")
	public Class169(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_60 = arg2;
		this.aClass32_61 = arg1;
		@Pc(24) Class3_Sub7 local24 = new Class3_Sub7(arg0.method785(0, 0));
		@Pc(28) int local28 = local24.method2588();
		this.aClass76Array1 = new Class76[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method2582() == 1) {
				this.aClass76Array1[local34] = new Class76();
			}
		}
		for (@Pc(54) int local54 = 0; local54 < local28; local54++) {
			if (this.aClass76Array1[local54] != null) {
				this.aClass76Array1[local54].aBoolean207 = local24.method2582() == 0;
			}
		}
		for (@Pc(79) int local79 = 0; local79 < local28; local79++) {
			if (this.aClass76Array1[local79] != null) {
				this.aClass76Array1[local79].aBoolean212 = local24.method2582() == 1;
			}
		}
		for (@Pc(111) int local111 = 0; local111 < local28; local111++) {
			if (this.aClass76Array1[local111] != null) {
				this.aClass76Array1[local111].aBoolean208 = local24.method2582() == 1;
			}
		}
		for (@Pc(137) int local137 = 0; local137 < local28; local137++) {
			if (this.aClass76Array1[local137] != null) {
				this.aClass76Array1[local137].aBoolean209 = local24.method2582() == 1;
			}
		}
		for (@Pc(167) int local167 = 0; local167 < local28; local167++) {
			if (this.aClass76Array1[local167] != null) {
				this.aClass76Array1[local167].aByte44 = local24.method2612();
			}
		}
		for (@Pc(192) int local192 = 0; local192 < local28; local192++) {
			if (this.aClass76Array1[local192] != null) {
				this.aClass76Array1[local192].aByte45 = local24.method2612();
			}
		}
		for (@Pc(213) int local213 = 0; local213 < local28; local213++) {
			if (this.aClass76Array1[local213] != null) {
				this.aClass76Array1[local213].aByte46 = local24.method2612();
			}
		}
		for (@Pc(234) int local234 = 0; local234 < local28; local234++) {
			if (this.aClass76Array1[local234] != null) {
				this.aClass76Array1[local234].aByte40 = local24.method2612();
			}
		}
		for (@Pc(255) int local255 = 0; local255 < local28; local255++) {
			if (this.aClass76Array1[local255] != null) {
				this.aClass76Array1[local255].aShort47 = (short) local24.method2588();
			}
		}
		for (@Pc(281) int local281 = 0; local281 < local28; local281++) {
			if (this.aClass76Array1[local281] != null) {
				this.aClass76Array1[local281].aByte41 = local24.method2612();
			}
		}
		for (@Pc(306) int local306 = 0; local306 < local28; local306++) {
			if (this.aClass76Array1[local306] != null) {
				this.aClass76Array1[local306].aByte42 = local24.method2612();
			}
		}
		for (@Pc(331) int local331 = 0; local331 < local28; local331++) {
			if (this.aClass76Array1[local331] != null) {
				this.aClass76Array1[local331].aBoolean214 = local24.method2582() == 1;
			}
		}
		for (@Pc(357) int local357 = 0; local357 < local28; local357++) {
			if (this.aClass76Array1[local357] != null) {
				this.aClass76Array1[local357].aBoolean216 = local24.method2582() == 1;
			}
		}
		for (@Pc(387) int local387 = 0; local387 < local28; local387++) {
			if (this.aClass76Array1[local387] != null) {
				this.aClass76Array1[local387].aByte43 = local24.method2612();
			}
		}
		for (@Pc(412) int local412 = 0; local412 < local28; local412++) {
			if (this.aClass76Array1[local412] != null) {
				this.aClass76Array1[local412].aBoolean211 = local24.method2582() == 1;
			}
		}
		for (@Pc(440) int local440 = 0; local440 < local28; local440++) {
			if (this.aClass76Array1[local440] != null) {
				this.aClass76Array1[local440].aBoolean210 = local24.method2582() == 1;
			}
		}
		for (@Pc(468) int local468 = 0; local468 < local28; local468++) {
			if (this.aClass76Array1[local468] != null) {
				this.aClass76Array1[local468].aBoolean213 = local24.method2582() == 1;
			}
		}
		for (@Pc(500) int local500 = 0; local500 < local28; local500++) {
			if (this.aClass76Array1[local500] != null) {
				this.aClass76Array1[local500].anInt2415 = local24.method2582();
			}
		}
		for (@Pc(521) int local521 = 0; local521 < local28; local521++) {
			if (this.aClass76Array1[local521] != null) {
				this.aClass76Array1[local521].anInt2414 = local24.method2589();
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIZZF)[I")
	@Override
	public int[] method3920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) float arg4) {
		return this.method3924(arg0).method5956((double) arg4, this.aClass76Array1[arg0].aBoolean216, this, arg3, this.aClass32_60, arg1, arg2);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method3921(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub4_Sub18 local13 = this.method3924(arg0);
		return local13 != null && local13.method5953(this.aClass32_60, this);
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)Lclient!wr;")
	private Class3_Sub4_Sub18 method3924(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub4 local15 = this.aClass101_1.method2479((long) arg0);
		if (local15 != null) {
			return (Class3_Sub4_Sub18) local15;
		}
		@Pc(28) byte[] local28 = this.aClass32_61.method811(arg0);
		if (local28 == null) {
			return null;
		} else {
			@Pc(40) Class3_Sub4_Sub18 local40 = new Class3_Sub4_Sub18(new Class3_Sub7(local28));
			this.aClass101_1.method2477((long) arg0, local40);
			return local40;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZIIFII)[I")
	@Override
	public int[] method3919(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		return this.method3924(arg0).method5959(this.aClass32_60, arg1, arg3, (double) arg2, this.aClass76Array1[arg0].aBoolean216, this);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)Lclient!fg;")
	@Override
	public Class76 method3918(@OriginalArg(1) int arg0) {
		return this.aClass76Array1[arg0];
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IFIZII)[F")
	@Override
	public float[] method3922(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method3924(arg2).method5958(this.aClass32_60, this.aClass76Array1[arg2].aBoolean216, arg3, this, arg0);
	}
}
