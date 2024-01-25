import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class225 implements Interface18 {

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "Z")
	private boolean aBoolean489;

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "Lclient!ha;")
	private Class16 aClass16_15;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Lclient!lda;")
	private final Class192 aClass192_1;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "[Lclient!mp;")
	private final Interface16[] anInterface16Array1;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!lda;Lclient!md;)V")
	public Class225(@OriginalArg(0) Class192 arg0, @OriginalArg(1) Class201 arg1) {
		this.aClass192_1 = arg0;
		this.anInterface16Array1 = new Interface16[this.aClass192_1.anInterface24Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface16Array1.length; local15++) {
			this.anInterface16Array1[local15] = arg1.method5391(this.aClass192_1.anInterface24Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method8415(@OriginalArg(0) long arg0) {
		return Static342.method5463() >= arg0 + (long) this.aClass192_1.anInt6057;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)I")
	@Override
	public int method8416() {
		return this.aClass192_1.anInt6062;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	@Override
	public void method8412() {
		if (Static171.aClass16_5 != this.aClass16_15) {
			this.aClass16_15 = Static171.aClass16_5;
			this.aBoolean489 = true;
		}
		this.aClass16_15.GA(0);
		@Pc(22) Interface16[] local22 = this.anInterface16Array1;
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Interface16 local30 = local22[local24];
			if (local30 != null) {
				local30.method8624();
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8417(@OriginalArg(0) boolean arg0) {
		@Pc(14) Interface16[] local14 = this.anInterface16Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Interface16 local22 = local14[local16];
			if (local22 != null) {
				local22.method8622();
			}
		}
		this.aBoolean489 = false;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)I")
	@Override
	public int method8413() {
		@Pc(7) int local7 = 0;
		@Pc(16) Interface16[] local16 = this.anInterface16Array1;
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Interface16 local24 = local16[local18];
			if (local24 == null || local24.method8623()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface16Array1.length;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	@Override
	public void method8414() {
	}
}
