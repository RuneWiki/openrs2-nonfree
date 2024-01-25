import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public class Class37 implements Interface5 {

	@OriginalMember(owner = "client!bfa", name = "f", descriptor = "Lclient!fs;")
	protected Class134 aClass134_8;

	@OriginalMember(owner = "client!bfa", name = "g", descriptor = "Lclient!la;")
	private final Class208 aClass208_18;

	@OriginalMember(owner = "client!bfa", name = "l", descriptor = "Lclient!kc;")
	protected final Class63 aClass63_2;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lclient!la;Lclient!kc;)V")
	public Class37(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class63 arg1) {
		this.aClass208_18 = arg0;
		this.aClass63_2 = arg1;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V")
	@Override
	public final void method8948() {
		this.aClass134_8 = Static332.method5056(this.aClass208_18, this.aClass63_2.anInt1111);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method8947() {
		return this.aClass208_18.method4977(this.aClass63_2.anInt1111);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8946() {
		@Pc(23) int local23 = this.aClass63_2.aClass219_4.method5206(this.aClass134_8.method9231(), Static264.anInt4559) + this.aClass63_2.anInt1113;
		@Pc(37) int local37 = this.aClass63_2.aClass368_4.method8776(this.aClass134_8.method9232(), Static47.anInt794) + this.aClass63_2.anInt1110;
		this.aClass134_8.method9235(local23, local37);
	}
}
