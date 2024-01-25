import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class375 implements Interface5 {

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "Lclient!hk;")
	private Class155 aClass155_37;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "Lclient!pq;")
	private final Class292 aClass292_1;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Lclient!gda;")
	private final Class126 aClass126_285;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!gda;Lclient!pq;)V")
	public Class375(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class292 arg1) {
		this.aClass292_1 = arg1;
		this.aClass126_285 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
	@Override
	public void method8563() {
		this.aClass155_37 = Static489.method6886(this.aClass126_285, this.aClass292_1.anInt7541);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8562() {
		@Pc(15) int local15 = Static592.anInt9548 < Static85.anInt9921 ? Static85.anInt9921 : Static592.anInt9548;
		@Pc(23) int local23 = Static401.anInt6745 < Static256.anInt4629 ? Static256.anInt4629 : Static401.anInt6745;
		@Pc(27) int local27 = this.aClass155_37.method7206();
		@Pc(31) int local31 = this.aClass155_37.method7209();
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = local15;
		@Pc(41) int local41 = local31 * local15 / local27;
		@Pc(48) int local48 = (local23 - local41) / 2;
		if (local23 < local41) {
			local41 = local23;
			local48 = 0;
			local35 = local23 * local27 / local31;
			local33 = (local15 - local35) / 2;
		}
		this.aClass155_37.method7192(local33, local48, local35, local41);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		return this.aClass126_285.method3077(this.aClass292_1.anInt7541);
	}
}
