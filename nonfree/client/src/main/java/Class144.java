import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class144 {

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!ge;")
	private final Class83 aClass83_29 = new Class83(256);

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_26;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!l;")
	private final Interface4 anInterface4_6;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!bt;Lclient!l;)V")
	public Class144(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Interface4 arg1) {
		this.aClass30_Sub1_26 = arg0;
		this.anInterface4_6 = arg1;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public void method3823() {
		this.aClass83_29.method2345(5);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
	public void method3824() {
		this.aClass83_29.method2346();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Lclient!uk;")
	public Class62_Sub2 method3825(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass83_29.method2338((long) arg0);
		if (local12 != null) {
			return (Class62_Sub2) local12;
		} else if (this.anInterface4_6.method5684(arg0)) {
			@Pc(31) Class160 local31 = this.anInterface4_6.method5685(arg0);
			@Pc(40) int local40 = local31.aBoolean322 ? 64 : this.aClass30_Sub1_26.anInt834;
			@Pc(78) Class62_Sub2 local78;
			if (local31.aBoolean325 && this.aClass30_Sub1_26.method2040()) {
				@Pc(57) float[] local57 = this.anInterface4_6.method5687(local40, arg0, 0.7F, local40);
				local78 = new Class62_Sub2(this.aClass30_Sub1_26, 3553, 34842, local40, local40, local31.aByte54 != 0, local57, 6408);
			} else {
				@Pc(93) int[] local93;
				if (local31.aBoolean320) {
					local93 = this.anInterface4_6.method5683(local40, local40, arg0, 0.7F);
				} else {
					local93 = this.anInterface4_6.method5686(0.7F, false, local40, local40, arg0);
				}
				local78 = new Class62_Sub2(this.aClass30_Sub1_26, 3553, 6408, local40, local40, local31.aByte54 != 0, local93, false);
			}
			local78.method2681(local31.aBoolean324, local31.aBoolean321);
			this.aClass83_29.method2337(local78, (long) arg0);
			return local78;
		} else {
			return null;
		}
	}
}
