import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class226 implements Interface15 {

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Z")
	private boolean aBoolean608;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "Lclient!ha;")
	private Class33 aClass33_13;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!jha;")
	private final Class160 aClass160_1;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "[Lclient!bq;")
	private final Interface4[] anInterface4Array1;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!jha;Lclient!nm;)V")
	public Class226(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class233 arg1) {
		this.aClass160_1 = arg0;
		this.anInterface4Array1 = new Interface4[this.aClass160_1.anInterface1Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface4Array1.length; local15++) {
			this.anInterface4Array1[local15] = arg1.method6045(this.aClass160_1.anInterface1Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	@Override
	public void method7158() {
		if (this.aClass33_13 != Static47.aClass33_3) {
			this.aClass33_13 = Static47.aClass33_3;
			this.aBoolean608 = true;
		}
		this.aClass33_13.GA(0);
		@Pc(30) Interface4[] local30 = this.anInterface4Array1;
		for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
			@Pc(38) Interface4 local38 = local30[local32];
			if (local38 != null) {
				local38.method8346();
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	@Override
	public void method7157() {
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7156(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface4[] local10 = this.anInterface4Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface4 local18 = local10[local12];
			if (local18 != null) {
				local18.method8345();
			}
		}
		this.aBoolean608 = false;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)I")
	@Override
	public int method7155() {
		return this.aClass160_1.anInt5741;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)I")
	@Override
	public int method7159() {
		@Pc(7) int local7 = 0;
		@Pc(16) Interface4[] local16 = this.anInterface4Array1;
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Interface4 local24 = local16[local18];
			if (local24 == null || local24.method8344()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface4Array1.length;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method7154(@OriginalArg(1) long arg0) {
		return (long) this.aClass160_1.anInt5739 + arg0 <= Static444.method6719();
	}
}
