import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class28 {

	@OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
	public int anInt485 = 64;

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "Z")
	public boolean aBoolean70 = false;

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
	public int anInt483 = 2;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
	public int anInt487 = 1;

	@OriginalMember(owner = "client!baa", name = "j", descriptor = "I")
	public int anInt488 = 64;

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
	public int anInt489 = -1;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IILclient!et;I)V")
	private void method509(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt489 = arg1.method8575();
			if (this.anInt489 == 65535) {
				this.anInt489 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt485 = arg1.method8575() + 1;
			this.anInt488 = arg1.method8575() + 1;
		} else if (arg0 == 3) {
			arg1.method8536();
		} else if (arg0 == 4) {
			this.anInt483 = arg1.method8581(-17416);
		} else if (arg0 == 5) {
			this.anInt487 = arg1.method8581(-17416);
		} else if (arg0 == 6) {
			this.aBoolean71 = true;
		} else if (arg0 == 7) {
			this.aBoolean70 = true;
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IILclient!et;)V")
	public void method511(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method8581(-17416);
			if (local5 == 0) {
				return;
			}
			this.method509(local5, arg1, arg0);
		}
	}
}
