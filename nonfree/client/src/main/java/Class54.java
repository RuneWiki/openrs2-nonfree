import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class54 {

	@OriginalMember(owner = "client!dq", name = "p", descriptor = "Lclient!fk;")
	private final Class74 aClass74_3 = new Class74();

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
	private final int anInt1156;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
	private int anInt1155;

	@OriginalMember(owner = "client!dq", name = "m", descriptor = "Lclient!ec;")
	private final Class58 aClass58_11;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(I)V")
	public Class54(@OriginalArg(0) int arg0) {
		this.anInt1156 = arg0;
		this.anInt1155 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass58_11 = new Class58(local14);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)V")
	public void method924() {
		if (Static345.aClass24_1 == null) {
			return;
		}
		for (@Pc(13) Class11_Sub4_Sub11 local13 = (Class11_Sub4_Sub11) this.aClass74_3.method1294(); local13 != null; local13 = (Class11_Sub4_Sub11) this.aClass74_3.method1288()) {
			if (local13.method5351()) {
				if (local13.method5352() == null) {
					local13.method5701();
					local13.method5580();
					this.anInt1155++;
				}
			} else if (++local13.aLong208 > (long) 5) {
				@Pc(35) Class11_Sub4_Sub11 local35 = Static345.aClass24_1.method1627(local13);
				this.aClass58_11.method1006(local13.aLong215, local35);
				Static83.method1220(local35, local13);
				local13.method5701();
				local13.method5580();
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLclient!t;)Ljava/lang/Object;")
	public Object method925(@OriginalArg(1) Interface8 arg0) {
		@Pc(9) long local9 = arg0.method4452();
		for (@Pc(16) Class11_Sub4_Sub11 local16 = (Class11_Sub4_Sub11) this.aClass58_11.method1009(local9); local16 != null; local16 = (Class11_Sub4_Sub11) this.aClass58_11.method1005()) {
			if (local16.anInterface8_3.method4453(arg0)) {
				@Pc(33) Object local33 = local16.method5352();
				if (local33 != null) {
					if (local16.method5351()) {
						@Pc(59) Class11_Sub4_Sub11_Sub1 local59 = new Class11_Sub4_Sub11_Sub1(arg0, local33);
						this.aClass58_11.method1006(local16.aLong215, local59);
						this.aClass74_3.method1290(local59);
						local59.aLong208 = 0L;
						local16.method5701();
						local16.method5580();
					} else {
						this.aClass74_3.method1290(local16);
						local16.aLong208 = 0L;
					}
					return local33;
				}
				local16.method5701();
				local16.method5580();
				this.anInt1155++;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)I")
	public int method926() {
		return this.anInt1155;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)I")
	public int method927() {
		return this.anInt1156;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
	public void method929() {
		this.aClass74_3.method1298();
		this.aClass58_11.method1011();
		this.anInt1155 = this.anInt1156;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Object;Lclient!t;B)V")
	public void method930(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface8 arg1) {
		this.method933(arg1);
		if (this.anInt1155 == 0) {
			@Pc(23) Class11_Sub4_Sub11 local23 = (Class11_Sub4_Sub11) this.aClass74_3.method1293();
			local23.method5701();
			local23.method5580();
		} else {
			this.anInt1155--;
		}
		@Pc(43) Class11_Sub4_Sub11_Sub1 local43 = new Class11_Sub4_Sub11_Sub1(arg1, arg0);
		this.aClass58_11.method1006(arg1.method4452(), local43);
		this.aClass74_3.method1290(local43);
		local43.aLong208 = 0L;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!t;I)V")
	private void method933(@OriginalArg(0) Interface8 arg0) {
		@Pc(13) long local13 = arg0.method4452();
		for (@Pc(20) Class11_Sub4_Sub11 local20 = (Class11_Sub4_Sub11) this.aClass58_11.method1009(local13); local20 != null; local20 = (Class11_Sub4_Sub11) this.aClass58_11.method1005()) {
			if (local20.anInterface8_3.method4453(arg0)) {
				local20.method5701();
				local20.method5580();
				this.anInt1155++;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)V")
	public void method934() {
		for (@Pc(7) Class11_Sub4_Sub11 local7 = (Class11_Sub4_Sub11) this.aClass74_3.method1294(); local7 != null; local7 = (Class11_Sub4_Sub11) this.aClass74_3.method1288()) {
			if (local7.method5351()) {
				local7.method5701();
				local7.method5580();
				this.anInt1155++;
			}
		}
	}
}
