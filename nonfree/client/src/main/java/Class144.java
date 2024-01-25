import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class144 {

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "Lclient!bh;")
	private final Class32 aClass32_36 = new Class32(256);

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "Lclient!d;")
	private final Interface6 anInterface6_12;

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_18;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!ep;Lclient!d;)V")
	public Class144(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Interface6 arg1) {
		this.anInterface6_12 = arg1;
		this.aClass95_Sub1_18 = arg0;
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)Lclient!fq;")
	public Class65_Sub1 method3027(@OriginalArg(1) int arg0) {
		@Pc(14) Object local14 = this.aClass32_36.method630((long) arg0);
		if (local14 != null) {
			return (Class65_Sub1) local14;
		} else if (this.anInterface6_12.method1493(arg0)) {
			@Pc(35) Class175 local35 = this.anInterface6_12.method1492(arg0);
			@Pc(44) int local44 = local35.aBoolean309 ? 64 : this.aClass95_Sub1_18.anInt2511;
			@Pc(104) Class65_Sub1 local104;
			if (local35.aBoolean303 && this.aClass95_Sub1_18.method6951()) {
				@Pc(116) float[] local116 = this.anInterface6_12.method1490(local44, arg0, 0.7F, local44);
				local104 = new Class65_Sub1(this.aClass95_Sub1_18, 3553, 34842, local44, local44, local35.aByte55 != 0, local116, 6408);
			} else {
				@Pc(72) int[] local72;
				if (local35.anInt4384 != 2 && Static207.method2926(local35.aByte52)) {
					local72 = this.anInterface6_12.method1489(true, local44, 0.7F, local44, arg0);
				} else {
					local72 = this.anInterface6_12.method1488(0.7F, local44, arg0, local44);
				}
				local104 = new Class65_Sub1(this.aClass95_Sub1_18, 3553, 6408, local44, local44, local35.aByte55 != 0, local72, 0, 0, false);
			}
			local104.method1424(local35.aBoolean307, local35.aBoolean304);
			this.aClass32_36.method629(local104, (long) arg0);
			return local104;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)V")
	public void method3028() {
		this.aClass32_36.method640();
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V")
	public void method3029() {
		this.aClass32_36.method634(5);
	}
}
