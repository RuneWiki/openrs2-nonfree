import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class337 implements Interface16 {

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "Lclient!da;")
	private Class67 aClass67_15;

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "Lclient!dv;")
	private final Class88 aClass88_1;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "Lclient!uq;")
	private final Class362 aClass362_132;

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "Lclient!uq;")
	private final Class362 aClass362_133;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lclient!uq;Lclient!uq;Lclient!dv;)V")
	public Class337(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) Class88 arg2) {
		this.aClass88_1 = arg2;
		this.aClass362_132 = arg1;
		this.aClass362_133 = arg0;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8282() {
		@Pc(16) int local16 = this.aClass88_1.aClass266_8.method5919(Static95.anInt9415, this.aClass88_1.anInt2157) + this.aClass88_1.anInt2160;
		@Pc(33) int local33 = this.aClass88_1.aClass131_11.method3034(this.aClass88_1.anInt2144, Static195.anInt3525) + this.aClass88_1.anInt2143;
		this.aClass67_15.method7672(local33, local16, (Class6[]) null, (int[]) null, this.aClass88_1.anInt2152, this.aClass88_1.aString31, this.aClass88_1.anInt2157, this.aClass88_1.anInt2147, this.aClass88_1.anInt2146, (Class1) null, 0, 0, this.aClass88_1.anInt2151, this.aClass88_1.anInt2156, this.aClass88_1.anInt2144);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8281() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass362_133.method8365(this.aClass88_1.anInt2150)) {
			local5 = false;
		}
		if (!this.aClass362_132.method8365(this.aClass88_1.anInt2150)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)V")
	@Override
	public void method8280() {
		@Pc(16) Class91 local16 = Static473.method6301(this.aClass88_1.anInt2150, this.aClass362_132);
		this.aClass67_15 = Static119.aClass95_4.method8032(local16, Static688.method8599(this.aClass362_133, this.aClass88_1.anInt2150));
	}
}
