import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class213 implements Interface15 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "Lclient!xa;")
	private Class4 aClass4_18;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "Lclient!hp;")
	private final Class135 aClass135_1;

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "Lclient!pq;")
	private final Class251 aClass251_99;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!pq;Lclient!hp;)V")
	public Class213(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class135 arg1) {
		this.aClass135_1 = arg1;
		this.aClass251_99 = arg0;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6566() {
		return this.aClass251_99.method5859(this.aClass135_1.anInt3341);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6565() {
		@Pc(12) int local12 = Static502.anInt8364 > Static282.anInt4679 ? Static502.anInt8364 : Static282.anInt4679;
		@Pc(19) int local19 = Static476.anInt8045 > Static381.anInt6587 ? Static476.anInt8045 : Static381.anInt6587;
		this.aClass4_18.method6509(0, 0, local12, local19);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
	@Override
	public void method6567() {
		this.aClass4_18 = Static96.method1502(this.aClass251_99.method5855(this.aClass135_1.anInt3341));
		this.method6565();
	}
}
