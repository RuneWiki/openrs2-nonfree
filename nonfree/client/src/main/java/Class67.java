import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public abstract class Class67 {

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "Z")
	protected boolean aBoolean390;

	@OriginalMember(owner = "client!ep", name = "J", descriptor = "Z")
	public boolean aBoolean402;

	@OriginalMember(owner = "client!ep", name = "M", descriptor = "Z")
	protected boolean aBoolean403;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "Z")
	public boolean aBoolean388 = true;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Z")
	public boolean aBoolean389 = true;

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "Z")
	public boolean aBoolean395 = true;

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
	public int anInt5845 = 2;

	@OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
	public int anInt5848 = 0;

	@OriginalMember(owner = "client!ep", name = "q", descriptor = "Z")
	public boolean aBoolean397 = true;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "Z")
	public boolean aBoolean393 = true;

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
	public int anInt5847 = 0;

	@OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
	public int anInt5852 = 127;

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
	public int anInt5842 = 3;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Z")
	public boolean aBoolean391 = true;

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "Z")
	public boolean aBoolean392 = true;

	@OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
	public int anInt5855 = 127;

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "Z")
	public boolean aBoolean396 = false;

	@OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
	public int anInt5851 = 0;

	@OriginalMember(owner = "client!ep", name = "C", descriptor = "Z")
	public boolean aBoolean400 = true;

	@OriginalMember(owner = "client!ep", name = "G", descriptor = "I")
	public int anInt5859 = 255;

	@OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
	public int anInt5856 = 1;

	@OriginalMember(owner = "client!ep", name = "F", descriptor = "I")
	public int anInt5858 = 0;

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
	protected int anInt5849 = 0;

	@OriginalMember(owner = "client!ep", name = "I", descriptor = "I")
	public int anInt5860 = 0;

	@OriginalMember(owner = "client!ep", name = "H", descriptor = "Z")
	public boolean aBoolean401 = false;

	@OriginalMember(owner = "client!ep", name = "A", descriptor = "Z")
	public boolean aBoolean399 = true;

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "Z")
	public boolean aBoolean398 = false;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "Z")
	protected boolean aBoolean394 = true;

	@OriginalMember(owner = "client!ep", name = "P", descriptor = "I")
	public int anInt5863 = 2;

	@OriginalMember(owner = "client!ep", name = "Q", descriptor = "Z")
	public boolean aBoolean404 = true;

	@OriginalMember(owner = "client!ep", name = "T", descriptor = "I")
	protected int anInt5865 = 2;

	@OriginalMember(owner = "client!ep", name = "S", descriptor = "Z")
	public boolean aBoolean405 = true;

	@OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
	public int anInt5854 = 0;

	@OriginalMember(owner = "client!ep", name = "U", descriptor = "I")
	public int anInt5866 = 2;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V")
	protected Class67() {
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)V")
	public final void method4519(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.anInt5865 = arg0;
		} else {
			this.anInt5849 = arg0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZB)V")
	public final void method4520(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.aBoolean403 = arg1;
		} else {
			this.aBoolean390 = arg1;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZ)I")
	public final int method4523(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt5865 : this.anInt5849;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)Z")
	public final boolean method4524(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean403 : this.aBoolean390;
	}
}
