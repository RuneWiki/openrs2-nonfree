import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class154_Sub1 extends Class154 implements Interface10 {

	@OriginalMember(owner = "client!qr", name = "w", descriptor = "[Lclient!ef;")
	private static final Class62[] aClass62Array1 = new Class62[32];

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
	private int anInt5490;

	static {
		@Pc(92) Class62[] local92 = Static194.method2565();
		for (@Pc(94) int local94 = 0; local94 < local92.length; local94++) {
			aClass62Array1[local92[local94].anInt1569] = local92[local94];
		}
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!od;I[BI)V")
	public Class154_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5490 = arg1;
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!od;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class154_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt5490 = arg1;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "([BIII)V")
	@Override
	public void method4283(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method4929(arg0, arg1);
		this.anInt5490 = arg2;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)I")
	@Override
	public int method4284() {
		return this.anInt5490;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)I")
	@Override
	public int method4281() {
		return 0;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)J")
	@Override
	public long method4282() {
		return super.aNativeBuffer4.a();
	}
}
