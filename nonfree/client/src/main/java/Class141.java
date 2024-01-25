import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public class Class141 implements Interface17 {

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Lclient!iea;")
	protected Class31 aClass31_17;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "Lclient!nd;")
	private final Class238 aClass238_184;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "Lclient!gq;")
	protected final Class135 aClass135_2;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!nd;Lclient!gq;)V")
	public Class141(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class135 arg1) {
		this.aClass238_184 = arg0;
		this.aClass135_2 = arg1;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8064() {
		@Pc(16) int local16 = this.aClass135_2.aClass97_16.method2304(this.aClass31_17.method8788(), Static143.anInt2998) + this.aClass135_2.anInt10395;
		@Pc(31) int local31 = this.aClass135_2.aClass252_12.method6014(this.aClass31_17.method8807(), Static478.anInt7732) + this.aClass135_2.anInt10393;
		this.aClass31_17.method8793(local16, local31);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	@Override
	public final void method8062() {
		this.aClass31_17 = Static449.method6408(this.aClass135_2.anInt10390, this.aClass238_184);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Z")
	@Override
	public final boolean method8063() {
		return this.aClass238_184.method5568(this.aClass135_2.anInt10390);
	}
}
