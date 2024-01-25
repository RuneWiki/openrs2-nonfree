import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class266 implements Interface5 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Lclient!da;")
	private Class70 aClass70_7;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "Lclient!jaa;")
	private final Class178 aClass178_1;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Lclient!gda;")
	private final Class126 aClass126_194;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "Lclient!gda;")
	private final Class126 aClass126_193;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!gda;Lclient!gda;Lclient!jaa;)V")
	public Class266(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_1 = arg2;
		this.aClass126_194 = arg1;
		this.aClass126_193 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass126_193.method3077(this.aClass178_1.anInt4643)) {
			local11 = false;
		}
		if (!this.aClass126_194.method3077(this.aClass178_1.anInt4643)) {
			local11 = false;
		}
		return local11;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
	@Override
	public void method8563() {
		@Pc(20) Class196 local20 = Static321.method4907(this.aClass126_194, this.aClass178_1.anInt4643);
		this.aClass70_7 = Static273.aClass100_6.method8612(local20, Static692.method8270(this.aClass126_193, this.aClass178_1.anInt4643));
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8562() {
		@Pc(25) int local25 = this.aClass178_1.aClass189_8.method4461(Static592.anInt9548, this.aClass178_1.anInt4634) + this.aClass178_1.anInt4633;
		@Pc(39) int local39 = this.aClass178_1.aClass346_7.method7688(this.aClass178_1.anInt4645, Static401.anInt6745) + this.aClass178_1.anInt4636;
		this.aClass70_7.method8435((Class1) null, this.aClass178_1.anInt4646, 0, this.aClass178_1.aString48, this.aClass178_1.anInt4645, this.aClass178_1.anInt4634, this.aClass178_1.anInt4647, local25, (Class155[]) null, 0, this.aClass178_1.anInt4637, this.aClass178_1.anInt4635, (int[]) null, this.aClass178_1.anInt4638, local39);
	}
}
