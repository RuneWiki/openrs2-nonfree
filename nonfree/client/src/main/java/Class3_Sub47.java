import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class3_Sub47 extends Class3 {

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	public final int anInt7682;

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
	public final int anInt7683;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(II)V")
	public Class3_Sub47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7682 = arg0;
		this.anInt7683 = arg1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)Z")
	public boolean method6622() {
		return (this.anInt7682 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)Z")
	public boolean method6623() {
		return (this.anInt7682 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
	public int method6624() {
		return this.anInt7682 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)Z")
	public boolean method6625() {
		return (this.anInt7682 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)I")
	public int method6627() {
		return Static411.method5502(this.anInt7682);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)Z")
	public boolean method6628(@OriginalArg(1) int arg0) {
		return (this.anInt7682 >> arg0 + 1 & 0x1) != 0;
	}
}
