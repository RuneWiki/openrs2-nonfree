import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class88 {

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "Lclient!ht;")
	public Interface5 anInterface5_2;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_11;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "B")
	public byte aByte33;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "B")
	public final byte aByte34;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "S")
	public final short aShort30;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!mi;Lclient!ht;III)V")
	public Class88(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInterface5_2 = arg1;
		this.aClass155_Sub1_11 = arg0;
		this.aByte33 = (byte) arg4;
		this.aByte34 = (byte) arg3;
		this.aShort30 = (short) arg2;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
	public void method1806() {
		this.aClass155_Sub1_11.method3601(this.anInterface5_2);
		this.anInterface5_2.method3934(this);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public void method1807() {
		this.aClass155_Sub1_11.method3601(this.anInterface5_2);
		this.anInterface5_2.method3931(this);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
	public void method1808() {
		this.aClass155_Sub1_11.method3601(this.anInterface5_2);
		this.anInterface5_2.method3933(this);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	public void method1809() {
		this.aClass155_Sub1_11.method3601(this.anInterface5_2);
		this.anInterface5_2.method3935(this);
	}
}
