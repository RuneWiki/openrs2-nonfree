import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class319 implements Interface13 {

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "Lclient!ul;")
	private final Class342 aClass342_2;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!qa;")
	private final Class269 aClass269_1;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!ul;Lclient!qa;)V")
	public Class319(@OriginalArg(0) Class342 arg0, @OriginalArg(1) Class269 arg1) {
		this.aClass342_2 = arg0;
		this.aClass269_1 = arg1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;IIILclient!da;I)I")
	private int method7942(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3) {
		return arg3.method8375(this.aClass269_1.anInt7970, arg0, 0, null, this.aClass269_1.anInt7977, null, arg1 + 5, 0, 0, this.aClass269_1.anInt7973 - 10, 0, this.aClass269_1.anInt7976 - 10, arg2 + 5, null, 0);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	@Override
	public void method8396() {
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8397() {
		@Pc(15) Class225 local15 = this.aClass342_2.method8225(this.aClass269_1.anInt7971);
		if (local15 == null) {
			return;
		}
		@Pc(31) int local31 = this.aClass269_1.aClass83_10.method2416(Static612.anInt9912, this.aClass269_1.anInt7976) + this.aClass269_1.anInt7969;
		@Pc(45) int local45 = this.aClass269_1.aClass50_11.method1701(this.aClass269_1.anInt7973, Static90.anInt2181) + this.aClass269_1.anInt7972;
		if (this.aClass269_1.aBoolean554) {
			Static323.aClass5_9.method7506(local31, local45, this.aClass269_1.anInt7976, this.aClass269_1.anInt7973, this.aClass269_1.anInt7967, 0);
		}
		local45 += this.method7942(local15.aString75, local45, local31, Static460.aClass62_9) * 12;
		local45 += 8;
		if (this.aClass269_1.aBoolean554) {
			Static323.aClass5_9.method7537(local31, local45, local31 + this.aClass269_1.anInt7976 - 1, local45, this.aClass269_1.anInt7967, 0);
		}
		local45++;
		local45 += this.method7942(local15.aString73, local45, local31, Static460.aClass62_9) * 12;
		local45 += 5;
		@Pc(130) int local130 = local45 + this.method7942(local15.aString74, local45, local31, Static460.aClass62_9) * 12;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8398() {
		return this.aClass342_2.method8227();
	}
}
