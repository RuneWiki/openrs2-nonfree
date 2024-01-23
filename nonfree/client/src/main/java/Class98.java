import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class98 {

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!ba;")
	private Class1 aClass1_125;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
	private int anInt3002 = 0;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "Lclient!qb;")
	private Class142 aClass142_12;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!qb;)V")
	public Class98(@OriginalArg(0) Class142 arg0) {
		this.aClass142_12 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Lclient!ba;")
	public Class1 method2609() {
		this.anInt3002 = 0;
		return this.method2613();
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Lclient!ba;")
	public Class1 method2613() {
		@Pc(25) Class1 local25;
		if (this.anInt3002 > 0 && this.aClass1_125 != this.aClass142_12.aClass1Array1[this.anInt3002 - 1]) {
			local25 = this.aClass1_125;
			this.aClass1_125 = local25.aClass1_235;
			return local25;
		}
		do {
			if (this.anInt3002 >= this.aClass142_12.anInt4180) {
				return null;
			}
			local25 = this.aClass142_12.aClass1Array1[this.anInt3002++].aClass1_235;
		} while (this.aClass142_12.aClass1Array1[this.anInt3002 - 1] == local25);
		this.aClass1_125 = local25.aClass1_235;
		return local25;
	}
}
