import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public abstract class Class27 implements Interface24 {

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "Lclient!da;")
	private Class19 aClass19_10;

	@OriginalMember(owner = "client!mw", name = "i", descriptor = "I")
	private int anInt7647;

	@OriginalMember(owner = "client!mw", name = "j", descriptor = "J")
	private long aLong231;

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "Lclient!ae;")
	private final Class8 aClass8_109;

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "Lclient!dda;")
	protected final Class63 aClass63_5;

	@OriginalMember(owner = "client!mw", name = "h", descriptor = "Lclient!ae;")
	protected final Class8 aClass8_110;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!ae;Lclient!ae;Lclient!dda;)V")
	protected Class27(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class63 arg2) {
		this.aClass8_109 = arg1;
		this.aClass63_5 = arg2;
		this.aClass8_110 = arg0;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method6629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZ)V")
	@Override
	public final void method8706() {
		@Pc(18) int local18 = this.aClass63_5.aClass7_9.method247(Static365.anInt6242, this.aClass63_5.anInt8537) + this.aClass63_5.anInt8533;
		@Pc(32) int local32 = this.aClass63_5.aClass249_12.method6236(Static335.anInt5755, this.aClass63_5.anInt8536) + this.aClass63_5.anInt8532;
		this.method6629(local18, local32);
		this.method6633(local18, local32);
		@Pc(54) String local54 = Static42.aClass252_1.method6249();
		if (Static566.method7936() - this.aLong231 > 10000L) {
			local54 = local54 + " (" + Static42.aClass252_1.method6257().method1119() + ")";
		}
		this.aClass19_10.method6328(this.aClass63_5.anInt8538 + local32 + this.aClass63_5.anInt8536 / 2 + 4, this.aClass63_5.anInt8534, local54, -1, local18 + this.aClass63_5.anInt8537 / 2);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8704() {
		@Pc(12) boolean local12 = true;
		if (!this.aClass8_110.method273(this.aClass63_5.anInt8535)) {
			local12 = false;
		}
		if (!this.aClass8_109.method273(this.aClass63_5.anInt8535)) {
			local12 = false;
		}
		return local12;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Z)I")
	protected final int method6631() {
		@Pc(16) int local16 = Static42.aClass252_1.method6259();
		@Pc(20) int local20 = local16 * 100;
		if (local16 == this.anInt7647 && local16 != 0) {
			@Pc(41) int local41 = Static42.aClass252_1.method6254();
			if (local16 < local41) {
				@Pc(56) long local56 = this.aLong231 - Static42.aClass252_1.method6258();
				if (local56 > 0L) {
					@Pc(72) long local72 = local56 * 10000L / (long) local16 * (long) (local41 - local16);
					@Pc(81) long local81 = (Static566.method7936() - this.aLong231) * 10000L;
					if (local81 < local72) {
						local20 = (int) ((long) (local41 - local16) * 100L * local81 / local72 + (long) (local16 * 100));
					} else {
						local20 = local41 * 100;
					}
				}
			}
		} else {
			this.anInt7647 = local16;
			this.aLong231 = Static566.method7936();
		}
		return local20;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
	@Override
	public void method8705() {
		@Pc(11) Class151 local11 = Static581.method8055(this.aClass8_109, this.aClass63_5.anInt8535);
		this.aClass19_10 = Static546.aClass132_13.method7518(local11, Static681.method2329(this.aClass8_110, this.aClass63_5.anInt8535));
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZII)V")
	protected abstract void method6633(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
