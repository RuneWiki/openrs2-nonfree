import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class Class91 implements Interface3 {

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
	public final int anInt1881;

	@OriginalMember(owner = "client!nga", name = "f", descriptor = "Lclient!jk;")
	public final Class189 aClass189_4;

	@OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
	public final int anInt1884;

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
	public final int anInt1883;

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "Lclient!tda;")
	public final Class346 aClass346_3;

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(ILclient!jk;Lclient!tda;II)V")
	public Class91(@OriginalArg(0) int arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1881 = arg0;
		this.aClass189_4 = arg1;
		this.anInt1884 = arg3;
		this.anInt1883 = arg4;
		this.aClass346_3 = arg2;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)Lclient!wh;")
	@Override
	public Class392 method8802() {
		return Static626.aClass392_8;
	}
}
