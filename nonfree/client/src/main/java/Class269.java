import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public final class Class269 {

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
	public int anInt7371;

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
	public int anInt7373;

	@OriginalMember(owner = "client!qfa", name = "k", descriptor = "I")
	public int anInt7377;

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
	public int anInt7372 = 128;

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "I")
	public int anInt7375 = 128;

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
	public int anInt7370;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(I)V")
	public Class269(@OriginalArg(0) int arg0) {
		this.anInt7370 = arg0;
	}

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(IIIIII)V")
	private Class269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7373 = arg5;
		this.anInt7377 = arg3;
		this.anInt7372 = arg2;
		this.anInt7370 = arg0;
		this.anInt7371 = arg4;
		this.anInt7375 = arg1;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)Lclient!qfa;")
	public Class269 method6087() {
		return new Class269(this.anInt7370, this.anInt7375, this.anInt7372, this.anInt7377, this.anInt7371, this.anInt7373);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZLclient!qfa;)V")
	public void method6088(@OriginalArg(1) Class269 arg0) {
		this.anInt7377 = arg0.anInt7377;
		this.anInt7375 = arg0.anInt7375;
		this.anInt7373 = arg0.anInt7373;
		this.anInt7370 = arg0.anInt7370;
		this.anInt7371 = arg0.anInt7371;
		this.anInt7372 = arg0.anInt7372;
	}
}
