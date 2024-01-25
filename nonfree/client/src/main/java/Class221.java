import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class221 {

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "Lclient!maa;")
	public Class5 aClass5_2;

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "Lclient!hma;")
	public Class163 aClass163_4;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "Lclient!bp;")
	public Class48 aClass48_1;

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "Lclient!lk;")
	public Class225 aClass225_109;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
	public int anInt5771;

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "Lclient!lk;")
	public Class225 aClass225_110;

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
	private int anInt5772;

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "Lclient!lk;")
	public Class225 aClass225_111;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
	public int anInt5774;

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
	public int anInt5775;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "Lclient!cga;")
	private final Class60 aClass60_115 = new Class60();

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
	private int anInt5767 = 0;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "Lclient!et;")
	private final Class2_Sub20 aClass2_Sub20_7 = new Class2_Sub20(1350);

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "Lclient!tw;")
	public final Class2_Sub20_Sub2 aClass2_Sub20_Sub2_2 = new Class2_Sub20_Sub2(15000);

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
	public int anInt5770 = 0;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	public int anInt5773 = 0;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
	public int anInt5769 = 0;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "Z")
	public boolean aBoolean488 = false;

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "Lclient!lk;")
	public Class225 aClass225_108 = null;

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "Z")
	public boolean aBoolean489 = true;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	public void method5169() {
		if (Static528.anInt8386 % 50 == 0) {
			this.anInt5774 = this.anInt5772;
			this.anInt5771 = this.anInt5775;
			this.anInt5772 = 0;
			this.anInt5775 = 0;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public void method5170() {
		if (this.aClass5_2 != null) {
			this.aClass5_2.method108();
			this.aClass5_2 = null;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	public void method5171(@OriginalArg(0) byte arg0) throws IOException {
		if (this.aClass5_2 != null && this.anInt5767 > 0) {
			this.aClass2_Sub20_7.anInt9723 = 0;
			while (true) {
				@Pc(24) Class2_Sub33 local24 = (Class2_Sub33) this.aClass60_115.method1226(7);
				if (local24 == null || this.aClass2_Sub20_7.aByteArray111.length - this.aClass2_Sub20_7.anInt9723 < local24.anInt4584) {
					this.aClass5_2.method111(this.aClass2_Sub20_7.aByteArray111, this.aClass2_Sub20_7.anInt9723);
					this.anInt5769 = 0;
					this.anInt5772 += this.aClass2_Sub20_7.anInt9723;
					break;
				}
				this.aClass2_Sub20_7.method8565(local24.aClass2_Sub20_Sub2_1.aByteArray111, 0, local24.anInt4584);
				this.anInt5767 -= local24.anInt4584;
				local24.method9872();
				local24.aClass2_Sub20_Sub2_1.method8535();
				local24.method4184();
			}
		}
		if (arg0 < 105) {
			Static361.method5172((byte[]) null);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!jga;B)V")
	public void method5173(@OriginalArg(0) Class2_Sub33 arg0) {
		this.aClass60_115.method1233(arg0);
		arg0.anInt4584 = arg0.aClass2_Sub20_Sub2_1.anInt9723;
		this.anInt5767 += arg0.anInt4584;
		arg0.aClass2_Sub20_Sub2_1.anInt9723 = 0;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	public void method5174() {
		this.aClass60_115.method1223();
		this.anInt5767 = 0;
	}
}
