import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class212 implements Interface12 {

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "Lclient!la;")
	private Class29 aClass29_10;

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "Lclient!pl;")
	private final Class259 aClass259_101;

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "Lclient!pl;")
	private final Class259 aClass259_100;

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "Lclient!nn;")
	private final Class233 aClass233_1;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!pl;Lclient!pl;Lclient!nn;)V")
	public Class212(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class233 arg2) {
		this.aClass259_101 = arg1;
		this.aClass259_100 = arg0;
		this.aClass233_1 = arg2;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7013() {
		@Pc(20) int local20 = this.aClass233_1.aClass62_13.method1173(Static26.anInt651, this.aClass233_1.anInt6476) + this.aClass233_1.anInt6483;
		@Pc(34) int local34 = this.aClass233_1.aClass279_11.method6456(Static554.anInt9119, this.aClass233_1.anInt6482) + this.aClass233_1.anInt6478;
		this.aClass29_10.method7104(this.aClass233_1.anInt6479, this.aClass233_1.anInt6472, null, this.aClass233_1.anInt6476, this.aClass233_1.aString56, this.aClass233_1.anInt6474, this.aClass233_1.anInt6475, this.aClass233_1.anInt6480, this.aClass233_1.anInt6482, null, null, 0, 0, local34, local20);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7015() {
		@Pc(12) boolean local12 = true;
		if (!this.aClass259_100.method5988(this.aClass233_1.anInt6473)) {
			local12 = false;
		}
		if (!this.aClass259_101.method5988(this.aClass233_1.anInt6473)) {
			local12 = false;
		}
		return local12;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	@Override
	public void method7014() {
		@Pc(17) Class294 local17 = Static461.method6506(this.aClass259_101, this.aClass233_1.anInt6473);
		this.aClass29_10 = Static307.aClass100_6.method6225(local17, Static596.method248(this.aClass259_100, this.aClass233_1.anInt6473));
	}
}
