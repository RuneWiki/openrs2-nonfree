import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public final class Class383 implements Interface10 {

	@OriginalMember(owner = "client!vga", name = "k", descriptor = "Lclient!da;")
	private Class68 aClass68_13;

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "Lclient!nca;")
	private final Class254 aClass254_164;

	@OriginalMember(owner = "client!vga", name = "e", descriptor = "Lclient!ws;")
	private final Class407 aClass407_1;

	@OriginalMember(owner = "client!vga", name = "i", descriptor = "Lclient!nca;")
	private final Class254 aClass254_163;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!nca;Lclient!nca;Lclient!ws;)V")
	public Class383(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class407 arg2) {
		this.aClass254_164 = arg0;
		this.aClass407_1 = arg2;
		this.aClass254_163 = arg1;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9560() {
		@Pc(20) int local20 = this.aClass407_1.aClass18_17.method282(Static33.anInt443, this.aClass407_1.anInt11033) + this.aClass407_1.anInt11044;
		@Pc(34) int local34 = this.aClass407_1.aClass239_21.method5836(Static277.anInt4340, this.aClass407_1.anInt11046) + this.aClass407_1.anInt11039;
		this.aClass68_13.method7900(this.aClass407_1.anInt11046, (int[]) null, this.aClass407_1.anInt11035, 0, local34, this.aClass407_1.anInt11033, (Class1) null, this.aClass407_1.anInt11036, this.aClass407_1.aString133, this.aClass407_1.anInt11037, this.aClass407_1.anInt11043, local20, (Class43[]) null, 0, this.aClass407_1.anInt11041);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V")
	@Override
	public void method9561() {
		@Pc(18) Class289 local18 = Static597.method8191(this.aClass254_163, this.aClass407_1.anInt11045);
		this.aClass68_13 = Static396.aClass145_6.method9707(local18, Static737.method8361(this.aClass254_164, this.aClass407_1.anInt11045), true);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9562() {
		@Pc(14) boolean local14 = true;
		if (!this.aClass254_164.method6072(this.aClass407_1.anInt11045)) {
			local14 = false;
		}
		if (!this.aClass254_163.method6072(this.aClass407_1.anInt11045)) {
			local14 = false;
		}
		return local14;
	}
}
