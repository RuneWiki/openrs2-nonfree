import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class57 {

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "F")
	public float aFloat28 = 1.0F;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "F")
	public float aFloat26 = 1.0F;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "F")
	public float aFloat29 = 0.25F;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "F")
	public final float aFloat25;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
	public final int anInt1586;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "F")
	public final float aFloat24;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public final int anInt1582;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
	public final int anInt1585;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	public final int anInt1589;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!lo;")
	public final Class139 aClass139_2;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "F")
	public final float aFloat27;

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
	public final int anInt1590;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
	public final int anInt1581;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class57() {
		this.aFloat25 = 1.1523438F;
		this.anInt1586 = -50;
		this.aFloat24 = 1.2F;
		this.anInt1582 = Static424.anInt7154;
		this.anInt1585 = Static26.anInt449;
		this.anInt1589 = -50;
		this.aClass139_2 = Static61.aClass139_1;
		this.aFloat27 = 0.69921875F;
		this.anInt1590 = 0;
		this.anInt1581 = -60;
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!nj;)V")
	public Class57(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(16) int local16 = arg0.method4096();
		if (Static39.aClass79_Sub1_1.method1939(Static402.anInt6656) && Static132.aClass167_4.method5986() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt1582 = Static424.anInt7154;
			} else {
				this.anInt1582 = arg0.method4108();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat25 = 1.1523438F;
			} else {
				this.aFloat25 = (float) arg0.method4083() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat27 = 0.69921875F;
			} else {
				this.aFloat27 = (float) arg0.method4083() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat24 = 1.2F;
			} else {
				this.aFloat24 = (float) arg0.method4083() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4108();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4083();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4083();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4083();
			}
			this.aFloat27 = 0.69921875F;
			this.aFloat25 = 1.1523438F;
			this.anInt1582 = Static424.anInt7154;
			this.aFloat24 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt1581 = -60;
			this.anInt1589 = -50;
			this.anInt1586 = -50;
		} else {
			this.anInt1589 = arg0.method4065();
			this.anInt1581 = arg0.method4065();
			this.anInt1586 = arg0.method4065();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt1585 = Static26.anInt449;
		} else {
			this.anInt1585 = arg0.method4108();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt1590 = 0;
		} else {
			this.anInt1590 = arg0.method4083();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass139_2 = Static61.aClass139_1;
		} else {
			@Pc(231) int local231 = arg0.method4083();
			@Pc(235) int local235 = arg0.method4083();
			@Pc(239) int local239 = arg0.method4083();
			@Pc(243) int local243 = arg0.method4083();
			@Pc(247) int local247 = arg0.method4083();
			@Pc(251) int local251 = arg0.method4083();
			this.aClass139_2 = Static321.method4443(local247, local235, local239, local231, local251, local243);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ee;)Z")
	public boolean method1539(@OriginalArg(1) Class57 arg0) {
		return arg0.anInt1582 == this.anInt1582 && this.aFloat25 == arg0.aFloat25 && arg0.aFloat27 == this.aFloat27 && this.aFloat24 == arg0.aFloat24 && arg0.aFloat29 == this.aFloat29 && this.aFloat28 == arg0.aFloat28 && this.aFloat26 == arg0.aFloat26 && arg0.anInt1585 == this.anInt1585 && arg0.anInt1590 == this.anInt1590 && this.aClass139_2 == arg0.aClass139_2;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!nj;B)V")
	public void method1540(@OriginalArg(0) Class3_Sub25 arg0) {
		this.aFloat28 = (float) (arg0.method4096() * 8) / 255.0F;
		this.aFloat29 = (float) (arg0.method4096() * 8) / 255.0F;
		this.aFloat26 = (float) (arg0.method4096() * 8) / 255.0F;
	}
}
