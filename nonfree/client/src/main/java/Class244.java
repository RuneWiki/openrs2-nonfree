import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class244 implements Interface1 {

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "Z")
	private boolean aBoolean531;

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "Lclient!r;")
	private Class100 aClass100_10;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "Lclient!nh;")
	private final Class231 aClass231_1;

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "[Lclient!ica;")
	private final Interface12[] anInterface12Array1;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!nh;Lclient!hm;)V")
	public Class244(@OriginalArg(0) Class231 arg0, @OriginalArg(1) Class141 arg1) {
		this.aClass231_1 = arg0;
		this.anInterface12Array1 = new Interface12[this.aClass231_1.anInterface19Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface12Array1.length; local15++) {
			this.anInterface12Array1[local15] = arg1.method3289(this.aClass231_1.anInterface19Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	@Override
	public void method5715() {
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)I")
	@Override
	public int method5718() {
		return this.aClass231_1.anInt6446;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method5717(@OriginalArg(0) long arg0) {
		return arg0 + (long) this.aClass231_1.anInt6448 <= Static548.method7437();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5713(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface12[] local10 = this.anInterface12Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface12 local18 = local10[local12];
			if (local18 != null) {
				local18.method7013();
			}
		}
		this.aBoolean531 = false;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	@Override
	public void method5714() {
		if (Static307.aClass100_6 != this.aClass100_10) {
			this.aClass100_10 = Static307.aClass100_6;
			this.aBoolean531 = true;
		}
		this.aClass100_10.ja(0);
		@Pc(29) Interface12[] local29 = this.anInterface12Array1;
		for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
			@Pc(37) Interface12 local37 = local29[local31];
			if (local37 != null) {
				local37.method7014();
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)I")
	@Override
	public int method5716() {
		@Pc(12) int local12 = 0;
		@Pc(15) Interface12[] local15 = this.anInterface12Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Interface12 local23 = local15[local17];
			if (local23 == null || local23.method7015()) {
				local12++;
			}
		}
		return local12 * 100 / this.anInterface12Array1.length;
	}
}
