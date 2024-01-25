import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class4_Sub1_Sub17 extends Class4_Sub1 {

	@OriginalMember(owner = "client!kca", name = "E", descriptor = "I")
	private int anInt5041;

	@OriginalMember(owner = "client!kca", name = "H", descriptor = "I")
	private int anInt5043;

	@OriginalMember(owner = "client!kca", name = "I", descriptor = "I")
	private int anInt5044;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(I)V")
	private Class4_Sub1_Sub17(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4435(arg0);
	}

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub17() {
		this(0);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.method4435(arg1.method4934());
		}
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "(II)V")
	private void method4435(@OriginalArg(0) int arg0) {
		this.anInt5043 = arg0 >> 4 & 0xFF0;
		this.anInt5041 = arg0 >> 12 & 0xFF0;
		this.anInt5044 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(26) int[] local26 = local18[0];
			@Pc(30) int[] local30 = local18[1];
			@Pc(34) int[] local34 = local18[2];
			for (@Pc(36) int local36 = 0; local36 < Static376.anInt7260; local36++) {
				local26[local36] = this.anInt5041;
				local30[local36] = this.anInt5043;
				local34[local36] = this.anInt5044;
			}
		}
		return local18;
	}
}
