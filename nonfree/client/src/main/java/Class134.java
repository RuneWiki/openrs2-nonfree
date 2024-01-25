import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class134 implements Interface21 {

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Z")
	private boolean aBoolean268;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!ha;")
	private Class5 aClass5_6;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "Lclient!dba;")
	private final Class64 aClass64_1;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "[Lclient!ko;")
	private final Interface13[] anInterface13Array1;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!dba;Lclient!iha;)V")
	public Class134(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class157 arg1) {
		this.aClass64_1 = arg0;
		this.anInterface13Array1 = new Interface13[this.aClass64_1.anInterface4Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface13Array1.length; local15++) {
			this.anInterface13Array1[local15] = arg1.method3944(this.aClass64_1.anInterface4Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)I")
	@Override
	public int method3923() {
		@Pc(12) int local12 = 0;
		@Pc(15) Interface13[] local15 = this.anInterface13Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Interface13 local23 = local15[local17];
			if (local23 == null || local23.method8398()) {
				local12++;
			}
		}
		return local12 * 100 / this.anInterface13Array1.length;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method3919(@OriginalArg(1) long arg0) {
		return Static374.method6036() >= arg0 + (long) this.aClass64_1.anInt2120;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
	@Override
	public void method3922() {
		if (this.aClass5_6 != Static323.aClass5_9) {
			this.aBoolean268 = true;
			this.aClass5_6 = Static323.aClass5_9;
		}
		this.aClass5_6.GA(0);
		@Pc(22) Interface13[] local22 = this.anInterface13Array1;
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Interface13 local30 = local22[local24];
			if (local30 != null) {
				local30.method8396();
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	@Override
	public void method3924() {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method3921(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface13[] local10 = this.anInterface13Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface13 local18 = local10[local12];
			if (local18 != null) {
				local18.method8397();
			}
		}
		this.aBoolean268 = false;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)I")
	@Override
	public int method3920() {
		return this.aClass64_1.anInt2119;
	}
}
