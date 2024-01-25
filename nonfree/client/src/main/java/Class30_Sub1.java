import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "J")
	public long aLong29;

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "Lclient!bw;")
	public Class30_Sub1 aClass30_Sub1_1;

	@OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
	public int anInt781;

	@OriginalMember(owner = "client!bw", name = "s", descriptor = "Z")
	public boolean aBoolean77;

	@OriginalMember(owner = "client!bw", name = "t", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
	public int anInt782;

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)C")
	@Override
	public char method749() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method741() {
		return this.aBoolean77;
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(B)I")
	@Override
	public int method746() {
		return this.anInt781;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)J")
	@Override
	public long method742() {
		return this.aLong29;
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)I")
	@Override
	public int method745() {
		return this.anInt782;
	}
}
