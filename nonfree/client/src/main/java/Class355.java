import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public final class Class355 implements Interface13 {

	@OriginalMember(owner = "client!vga", name = "f", descriptor = "Lclient!da;")
	private Class62 aClass62_13;

	@OriginalMember(owner = "client!vga", name = "d", descriptor = "Lclient!la;")
	private final Class196 aClass196_124;

	@OriginalMember(owner = "client!vga", name = "j", descriptor = "Lclient!qfa;")
	private final Class274 aClass274_1;

	@OriginalMember(owner = "client!vga", name = "e", descriptor = "Lclient!la;")
	private final Class196 aClass196_125;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!qfa;)V")
	public Class355(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class274 arg2) {
		this.aClass196_124 = arg0;
		this.aClass274_1 = arg2;
		this.aClass196_125 = arg1;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8397() {
		@Pc(19) int local19 = this.aClass274_1.aClass83_11.method2416(Static612.anInt9912, this.aClass274_1.anInt8065) + this.aClass274_1.anInt8074;
		@Pc(34) int local34 = this.aClass274_1.aClass50_13.method1701(this.aClass274_1.anInt8072, Static90.anInt2181) + this.aClass274_1.anInt8075;
		this.aClass62_13.method8375(this.aClass274_1.anInt8073, this.aClass274_1.aString89, this.aClass274_1.anInt8070, null, this.aClass274_1.anInt8077, null, local34, this.aClass274_1.anInt8067, 0, this.aClass274_1.anInt8072, 0, this.aClass274_1.anInt8065, local19, null, this.aClass274_1.anInt8078);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8398() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass196_124.method5111(this.aClass274_1.anInt8068)) {
			local5 = false;
		}
		if (!this.aClass196_125.method5111(this.aClass274_1.anInt8068)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V")
	@Override
	public void method8396() {
		@Pc(18) Class282 local18 = Static95.method2093(this.aClass196_125, this.aClass274_1.anInt8068);
		this.aClass62_13 = Static323.aClass5_9.method7515(local18, Static645.method2768(this.aClass196_124, this.aClass274_1.anInt8068));
	}
}
