import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class185 {

	@OriginalMember(owner = "client!on", name = "j", descriptor = "Lclient!jb;")
	public Class123 aClass123_3;

	@OriginalMember(owner = "client!on", name = "v", descriptor = "I")
	public int anInt4876;

	@OriginalMember(owner = "client!on", name = "d", descriptor = "I")
	public int anInt4863 = 127;

	@OriginalMember(owner = "client!on", name = "f", descriptor = "I")
	public int anInt4865 = 16;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "Z")
	public boolean aBoolean387 = true;

	@OriginalMember(owner = "client!on", name = "m", descriptor = "I")
	public int anInt4868 = -1;

	@OriginalMember(owner = "client!on", name = "b", descriptor = "I")
	public int anInt4861 = 128;

	@OriginalMember(owner = "client!on", name = "s", descriptor = "I")
	public int anInt4874 = 8;

	@OriginalMember(owner = "client!on", name = "l", descriptor = "Z")
	public boolean aBoolean388 = true;

	@OriginalMember(owner = "client!on", name = "h", descriptor = "I")
	public int anInt4866 = -1;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "Z")
	public boolean aBoolean389 = false;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "I")
	public int anInt4860 = 0;

	@OriginalMember(owner = "client!on", name = "o", descriptor = "I")
	public int anInt4870 = 1190717;

	@OriginalMember(owner = "client!on", name = "r", descriptor = "I")
	public int anInt4873 = -1;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BILclient!ti;)V")
	private void method3982(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt4860 = Static38.method501(arg1.method4496());
		} else if (arg0 == 2) {
			this.anInt4866 = arg1.method4548();
		} else if (arg0 == 3) {
			this.anInt4866 = arg1.method4498();
			if (this.anInt4866 == 65535) {
				this.anInt4866 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean387 = false;
			return;
		} else if (arg0 == 7) {
			this.anInt4868 = Static38.method501(arg1.method4496());
			return;
		} else if (arg0 == 8) {
			this.aClass123_3.anInt3407 = this.anInt4876;
		} else if (arg0 == 9) {
			this.anInt4861 = arg1.method4498() << 0;
			return;
		} else if (arg0 == 10) {
			this.aBoolean388 = false;
			return;
		} else if (arg0 == 11) {
			this.anInt4874 = arg1.method4548();
			return;
		} else if (arg0 == 12) {
			this.aBoolean389 = true;
			return;
		} else if (arg0 == 13) {
			this.anInt4870 = arg1.method4496();
			return;
		} else {
			if (arg0 == 14) {
				this.anInt4865 = arg1.method4548();
			} else if (arg0 == 15) {
				this.anInt4873 = arg1.method4498();
				if (this.anInt4873 == 65535) {
					this.anInt4873 = -1;
					return;
				}
			} else if (arg0 == 16) {
				this.anInt4863 = arg1.method4548();
				return;
			} else {
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!ti;)V")
	public void method3983(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method4548();
			if (local8 == 0) {
				return;
			}
			this.method3982(local8, arg0);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
	public void method3984() {
		this.anInt4874 = this.anInt4876 | this.anInt4874 << 8;
		if (this.anInt4873 == -1) {
			this.anInt4873 = this.anInt4866;
		}
	}
}
