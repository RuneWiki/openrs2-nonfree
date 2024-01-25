import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class123 implements Interface14 {

	@OriginalMember(owner = "client!go", name = "b", descriptor = "Z")
	private boolean aBoolean284;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "Lclient!r;")
	private Class44 aClass44_8;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "Lclient!ne;")
	private final Class230 aClass230_1;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "[Lclient!d;")
	private final Interface7[] anInterface7Array1;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!ne;Lclient!aj;)V")
	public Class123(@OriginalArg(0) Class230 arg0, @OriginalArg(1) Class16 arg1) {
		this.aClass230_1 = arg0;
		this.anInterface7Array1 = new Interface7[this.aClass230_1.anInterface23Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface7Array1.length; local15++) {
			this.anInterface7Array1[local15] = arg1.method192(this.aClass230_1.anInterface23Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)I")
	@Override
	public int method7597() {
		return this.aClass230_1.anInt6658;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7595(@OriginalArg(1) boolean arg0) {
		@Pc(17) Interface7[] local17 = this.anInterface7Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Interface7 local25 = local17[local19];
			if (local25 != null) {
				local25.method7418();
			}
		}
		this.aBoolean284 = false;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method7596(@OriginalArg(1) long arg0) {
		return arg0 + (long) this.aClass230_1.anInt6661 <= Static574.method8210();
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)I")
	@Override
	public int method7594() {
		@Pc(14) int local14 = 0;
		@Pc(17) Interface7[] local17 = this.anInterface7Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Interface7 local25 = local17[local19];
			if (local25 == null || local25.method7417()) {
				local14++;
			}
		}
		return local14 * 100 / this.anInterface7Array1.length;
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V")
	@Override
	public void method7598() {
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
	@Override
	public void method7593() {
		if (Static440.aClass44_12 != this.aClass44_8) {
			this.aClass44_8 = Static440.aClass44_12;
			this.aBoolean284 = true;
		}
		this.aClass44_8.ja(0);
		@Pc(22) Interface7[] local22 = this.anInterface7Array1;
		for (@Pc(28) int local28 = 0; local28 < local22.length; local28++) {
			@Pc(34) Interface7 local34 = local22[local28];
			if (local34 != null) {
				local34.method7416();
			}
		}
	}
}
