import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public abstract class Class5_Sub1_Sub6 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qia", name = "w", descriptor = "Lclient!nba;")
	public final Interface21 anInterface21_3;

	@OriginalMember(owner = "client!qia", name = "v", descriptor = "I")
	public final int anInt8436;

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Lclient!nba;I)V")
	protected Class5_Sub1_Sub6(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) int arg1) {
		this.anInterface21_3 = arg0;
		this.anInt8436 = arg1;
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(B)Z")
	public abstract boolean method7256();

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method7257();
}
