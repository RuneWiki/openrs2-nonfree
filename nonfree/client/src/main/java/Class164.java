import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class164 {

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
	public int anInt4232;

	@OriginalMember(owner = "client!jba", name = "o", descriptor = "Lclient!jb;")
	public Class163 aClass163_5;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
	public int anInt4230 = 64;

	@OriginalMember(owner = "client!jba", name = "j", descriptor = "I")
	public int anInt4238 = -1;

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "Z")
	public boolean aBoolean342 = true;

	@OriginalMember(owner = "client!jba", name = "i", descriptor = "I")
	public int anInt4237 = 1190717;

	@OriginalMember(owner = "client!jba", name = "p", descriptor = "I")
	public int anInt4242 = 0;

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
	public int anInt4234 = 8;

	@OriginalMember(owner = "client!jba", name = "k", descriptor = "I")
	public int anInt4239 = 512;

	@OriginalMember(owner = "client!jba", name = "h", descriptor = "I")
	public int anInt4236 = -1;

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "I")
	public int anInt4235 = 127;

	@OriginalMember(owner = "client!jba", name = "s", descriptor = "Z")
	public boolean aBoolean345 = false;

	@OriginalMember(owner = "client!jba", name = "r", descriptor = "Z")
	public boolean aBoolean344 = true;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZLclient!ee;)V")
	public void method3890(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8645();
			if (local13 == 0) {
				return;
			}
			this.method3893(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)V")
	public void method3892() {
		this.anInt4234 = this.anInt4232 | this.anInt4234 << 8;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!ee;I)V")
	private void method3893(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt4242 = Static78.method1247(arg1.method8657());
		} else if (arg0 == 2) {
			this.anInt4238 = arg1.method8645();
		} else if (arg0 == 3) {
			this.anInt4238 = arg1.method8631();
			if (this.anInt4238 == 65535) {
				this.anInt4238 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean342 = false;
		} else if (arg0 == 7) {
			this.anInt4236 = Static78.method1247(arg1.method8657());
			return;
		} else if (arg0 == 8) {
			this.aClass163_5.anInt4229 = this.anInt4232;
			return;
		} else if (arg0 == 9) {
			this.anInt4239 = arg1.method8631() << 2;
			return;
		} else if (arg0 == 10) {
			this.aBoolean344 = false;
			return;
		} else if (arg0 == 11) {
			this.anInt4234 = arg1.method8645();
			return;
		} else if (arg0 == 12) {
			this.aBoolean345 = true;
			return;
		} else {
			if (arg0 == 13) {
				this.anInt4237 = arg1.method8657();
			} else if (arg0 == 14) {
				this.anInt4230 = arg1.method8645() << 2;
				return;
			} else if (arg0 == 16) {
				this.anInt4235 = arg1.method8645();
				return;
			}
			return;
		}
	}
}
