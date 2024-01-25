import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class260 {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!vn;")
	public Class380 aClass380_4;

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "Lclient!go;")
	public Class141 aClass141_1;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Lclient!oja;")
	public Class270 aClass270_2;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "Lclient!sb;")
	public Class322 aClass322_126;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
	public int anInt7197;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
	public int anInt7201;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	public int anInt7202;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
	private int anInt7203;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!sb;")
	public Class322 aClass322_127;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!sb;")
	public Class322 aClass322_129;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "Lclient!tf;")
	private final Class340 aClass340_55 = new Class340();

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
	private int anInt7196 = 0;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Lclient!jc;")
	private final Class6_Sub15 aClass6_Sub15_116 = new Class6_Sub15(1350);

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!eea;")
	public final Class6_Sub15_Sub1 aClass6_Sub15_Sub1_2 = new Class6_Sub15_Sub1(15000);

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Z")
	public boolean aBoolean538 = false;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Z")
	public boolean aBoolean539 = true;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Lclient!sb;")
	public Class322 aClass322_128 = null;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
	public int anInt7198 = 0;

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
	public int anInt7200 = 0;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
	public int anInt7199 = 0;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
	public void method6399() throws IOException {
		if (this.aClass141_1 == null || this.anInt7196 <= 0) {
			return;
		}
		this.aClass6_Sub15_116.anInt3174 = 0;
		while (true) {
			@Pc(32) Class6_Sub13 local32 = (Class6_Sub13) this.aClass340_55.method8124();
			if (local32 == null || local32.anInt2125 > this.aClass6_Sub15_116.aByteArray20.length - this.aClass6_Sub15_116.anInt3174) {
				this.aClass141_1.method7609(this.aClass6_Sub15_116.aByteArray20, this.aClass6_Sub15_116.anInt3174);
				this.anInt7203 += this.aClass6_Sub15_116.anInt3174;
				this.anInt7200 = 0;
				return;
			}
			this.aClass6_Sub15_116.method2988(0, local32.aClass6_Sub15_Sub1_1.aByteArray20, local32.anInt2125);
			this.anInt7196 -= local32.anInt2125;
			local32.method9051();
			local32.aClass6_Sub15_Sub1_1.method3013();
			local32.method2052();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public void method6400() {
		if (this.aClass141_1 != null) {
			this.aClass141_1.method7615();
			this.aClass141_1 = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	public void method6402() {
		if (Static141.anInt8737 % 50 == 0) {
			this.anInt7201 = this.anInt7203;
			this.anInt7197 = this.anInt7202;
			this.anInt7203 = 0;
			this.anInt7202 = 0;
		}
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
	public void method6403() {
		this.aClass340_55.method8129();
		this.anInt7196 = 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!dm;I)V")
	public void method6404(@OriginalArg(0) Class6_Sub13 arg0) {
		this.aClass340_55.method8131(arg0);
		arg0.anInt2125 = arg0.aClass6_Sub15_Sub1_1.anInt3174;
		arg0.aClass6_Sub15_Sub1_1.anInt3174 = 0;
		this.anInt7196 += arg0.anInt2125;
	}
}
