import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "Lclient!bba;")
	protected Class26 aClass26_41;

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "Lclient!ie;")
	protected Class153 aClass153_41;

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
	public int anInt9545;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "Z")
	public boolean aBoolean696;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "[Lclient!lm;")
	public final Class1_Sub1[] aClass1_Sub1Array42;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean696 = arg1;
		this.aClass1_Sub1Array42 = new Class1_Sub1[arg0];
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)[[I")
	protected final int[][] method7880(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub1Array42[arg1].aBoolean696) {
			@Pc(24) int[] local24 = this.aClass1_Sub1Array42[arg1].method7888(arg0);
			return new int[][] { local24, local24, local24 };
		} else {
			return this.aClass1_Sub1Array42[arg1].method7883(arg0);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!io;I)V")
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(III)[I")
	protected final int[] method7882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass1_Sub1Array42[arg0].aBoolean696 ? this.aClass1_Sub1Array42[arg0].method7888(arg1) : this.aClass1_Sub1Array42[arg0].method7883(arg1)[0];
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)[[I")
	public int[][] method7883(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I")
	public int method7884() {
		return -1;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	public void method7885() {
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)[I")
	public int[] method7888(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)I")
	public int method7889() {
		return -1;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
	public void method7890() {
		if (this.aBoolean696) {
			this.aClass26_41.method787();
			this.aClass26_41 = null;
		} else {
			this.aClass153_41.method3559();
			this.aClass153_41 = null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(III)V")
	public void method7891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt9545 == 255 ? arg0 : this.anInt9545;
		if (this.aBoolean696) {
			this.aClass26_41 = new Class26(local12, arg0, arg1);
		} else {
			this.aClass153_41 = new Class153(local12, arg0, arg1);
		}
	}
}
