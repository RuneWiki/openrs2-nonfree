import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UTHWSBEX")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!UTHWSBEX", name = "m", descriptor = "I")
	public int anInt717;

	@OriginalMember(owner = "client!UTHWSBEX", name = "o", descriptor = "I")
	public int anInt719;

	@OriginalMember(owner = "client!UTHWSBEX", name = "n", descriptor = "I")
	private int anInt718 = 964;

	@OriginalMember(owner = "client!UTHWSBEX", name = "a", descriptor = "(I)Lclient!OJGAHFXC;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method504(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class19 local3 = Class19.method315(this.anInt719);
			return local3.method309(this.anInt717);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("15079, " + 822 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}
}
