import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class1_Sub49 extends Class1 {

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
	public final int anInt9538;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
	public final int anInt9530;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(II)V")
	public Class1_Sub49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9538 = arg1;
		this.anInt9530 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z")
	public boolean method7772(@OriginalArg(0) int arg0) {
		return (this.anInt9530 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I")
	public int method7773() {
		return this.anInt9530 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)I")
	public int method7774() {
		return Static64.method1168(this.anInt9530);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)Z")
	public boolean method7775() {
		return (this.anInt9530 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)Z")
	public boolean method7778() {
		return (this.anInt9530 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)Z")
	public boolean method7779() {
		return (this.anInt9530 >> 22 & 0x1) != 0;
	}
}
