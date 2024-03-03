import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class191 {

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
	public static int anInt5358 = 0;

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
	public static final int anInt5356 = 52;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_113 = new Class79("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "Lclient!s;")
	public static final Class210 aClass210_11;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
	public static int anInt5362;

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
	public static int anInt5363;

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "Lclient!bs;")
	private Class12_Sub1 aClass12_Sub1_8;

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Lclient!bs;")
	public final Class12_Sub1 aClass12_Sub1_7 = new Class12_Sub1();

	static {
		new Class79("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
		aClass210_11 = new Class210(12, 7);
		anInt5362 = 0;
		anInt5363 = 0;
		anIntArrayArray44 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 291)
	public Class191() {
		this.aClass12_Sub1_7.aClass12_Sub1_5 = this.aClass12_Sub1_7;
		this.aClass12_Sub1_7.aClass12_Sub1_6 = this.aClass12_Sub1_7;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)Lclient!bs;", line = 84)
	public Class12_Sub1 method4889() {
		@Pc(14) Class12_Sub1 local14 = this.aClass12_Sub1_8;
		if (this.aClass12_Sub1_7 == local14) {
			this.aClass12_Sub1_8 = null;
			return null;
		} else {
			this.aClass12_Sub1_8 = local14.aClass12_Sub1_5;
			return local14;
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)Lclient!bs;", line = 117)
	public Class12_Sub1 method4891() {
		@Pc(11) Class12_Sub1 local11 = this.aClass12_Sub1_7.aClass12_Sub1_5;
		if (local11 == this.aClass12_Sub1_7) {
			this.aClass12_Sub1_8 = null;
			return null;
		} else {
			this.aClass12_Sub1_8 = local11.aClass12_Sub1_5;
			return local11;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!bs;I)V", line = 143)
	public void method4892(@OriginalArg(0) Class12_Sub1 arg0) {
		if (arg0.aClass12_Sub1_6 != null) {
			arg0.method4207();
		}
		arg0.aClass12_Sub1_6 = this.aClass12_Sub1_7.aClass12_Sub1_6;
		arg0.aClass12_Sub1_5 = this.aClass12_Sub1_7;
		arg0.aClass12_Sub1_6.aClass12_Sub1_5 = arg0;
		arg0.aClass12_Sub1_5.aClass12_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V", line = 161)
	public void method4893() {
		while (true) {
			@Pc(13) Class12_Sub1 local13 = this.aClass12_Sub1_7.aClass12_Sub1_5;
			if (this.aClass12_Sub1_7 == local13) {
				this.aClass12_Sub1_8 = null;
				return;
			}
			local13.method4207();
		}
	}
}
