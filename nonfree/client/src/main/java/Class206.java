import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class206 implements Interface7 {

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "Lclient!la;")
	private Class58 aClass58_6;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "Lclient!jn;")
	private final Class176 aClass176_77;

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "Lclient!jn;")
	private final Class176 aClass176_78;

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "Lclient!rp;")
	private final Class294 aClass294_1;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!jn;Lclient!jn;Lclient!rp;)V")
	public Class206(@OriginalArg(0) Class176 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class294 arg2) {
		this.aClass176_77 = arg1;
		this.aClass176_78 = arg0;
		this.aClass294_1 = arg2;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	@Override
	public void method7416() {
		@Pc(15) Class114 local15 = Static503.method7393(this.aClass176_77, this.aClass294_1.anInt8594);
		this.aClass58_6 = Static440.aClass44_12.method4983(local15, Static598.method6316(this.aClass176_78, this.aClass294_1.anInt8594));
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7418() {
		@Pc(22) int local22 = this.aClass294_1.aClass258_9.method6279(Static501.anInt6750, this.aClass294_1.anInt8598) + this.aClass294_1.anInt8600;
		@Pc(37) int local37 = this.aClass294_1.aClass250_10.method6077(this.aClass294_1.anInt8599, Static212.anInt3952) + this.aClass294_1.anInt8597;
		this.aClass58_6.method8159(this.aClass294_1.anInt8596, this.aClass294_1.anInt8595, 0, null, this.aClass294_1.aString82, this.aClass294_1.anInt8598, this.aClass294_1.anInt8590, 0, null, local37, null, this.aClass294_1.anInt8599, local22, this.aClass294_1.anInt8601, this.aClass294_1.anInt8593);
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7417() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass176_78.method3996(this.aClass294_1.anInt8594)) {
			local5 = false;
		}
		if (!this.aClass176_77.method3996(this.aClass294_1.anInt8594)) {
			local5 = false;
		}
		return local5;
	}
}
