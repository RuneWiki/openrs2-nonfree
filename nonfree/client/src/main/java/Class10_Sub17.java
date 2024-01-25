import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class10_Sub17 extends Class10 {

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "Lclient!lv;")
	private Class3_Sub32 aClass3_Sub32_3;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
	private final int anInt8956;

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
	private final int anInt8955;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub17(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt8956 = arg0.method5272();
		this.anInt8955 = arg0.method5322(-127);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9145() {
		if (this.aClass3_Sub32_3 == null) {
			this.aClass3_Sub32_3 = Static729.method5712(Static191.aClass221_51, this.anInt8956, 0);
		}
		if (this.aClass3_Sub32_3 == null) {
			return false;
		} else {
			return Static564.method7846(this.aClass3_Sub32_3);
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static710.method9256(this.anInt8955, this.aClass3_Sub32_3);
	}
}
