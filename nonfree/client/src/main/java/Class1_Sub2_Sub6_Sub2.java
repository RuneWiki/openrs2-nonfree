import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class1_Sub2_Sub6_Sub2 extends Class1_Sub2_Sub6 {

	@OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
	public int anInt6722;

	@OriginalMember(owner = "client!pm", name = "G", descriptor = "Lclient!os;")
	public Class1_Sub17 aClass1_Sub17_7;

	@OriginalMember(owner = "client!pm", name = "I", descriptor = "B")
	public byte aByte77;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)I")
	@Override
	public int method6033() {
		return this.aClass1_Sub17_7 == null ? 0 : this.aClass1_Sub17_7.anInt4872 * 100 / (this.aClass1_Sub17_7.aByteArray58.length - this.aByte77);
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method6032() {
		if (super.aBoolean497 || this.aClass1_Sub17_7.aByteArray58.length - this.aByte77 > this.aClass1_Sub17_7.anInt4872) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub17_7.aByteArray58;
	}
}
