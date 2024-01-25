import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class256 implements Interface23 {

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "Lclient!xa;")
	private Class66 aClass66_29;

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "Lclient!jo;")
	private final Class168 aClass168_95;

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "Lclient!sv;")
	private final Class292 aClass292_1;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!jo;Lclient!sv;)V")
	public Class256(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class292 arg1) {
		this.aClass168_95 = arg0;
		this.aClass292_1 = arg1;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8047() {
		@Pc(12) int local12 = Static419.anInt7811 < Static228.anInt4744 ? Static228.anInt4744 : Static419.anInt7811;
		@Pc(19) int local19 = Static180.anInt4051 > Static79.anInt9888 ? Static180.anInt4051 : Static79.anInt9888;
		this.aClass66_29.method8065(0, 0, local12, local19);
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return this.aClass168_95.method4427(this.aClass292_1.anInt8740);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
	@Override
	public void method8048() {
		this.aClass66_29 = Static223.method4015(this.aClass168_95.method4438(this.aClass292_1.anInt8740));
		this.method8047();
	}
}
