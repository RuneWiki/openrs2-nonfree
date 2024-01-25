import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class34_Sub6 extends Class34 {

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "Z")
	private boolean aBoolean532;

	@OriginalMember(owner = "client!mv", name = "x", descriptor = "Z")
	private boolean aBoolean535;

	@OriginalMember(owner = "client!mv", name = "v", descriptor = "Z")
	private boolean aBoolean534 = false;

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "Z")
	private final boolean aBoolean533;

	@OriginalMember(owner = "client!mv", name = "j", descriptor = "Lclient!rd;")
	private Class300 aClass300_4;

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "Lclient!rd;")
	private Class300 aClass300_2;

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "Lclient!rd;")
	private Class300 aClass300_3;

	@OriginalMember(owner = "client!mv", name = "m", descriptor = "Lclient!rd;")
	private Class300 aClass300_5;

	@OriginalMember(owner = "client!mv", name = "k", descriptor = "Lclient!sia;")
	private Class24_Sub4 aClass24_Sub4_1;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!rda;)V")
	public Class34_Sub6(@OriginalArg(0) Class126_Sub3 arg0) {
		super(arg0);
		if (super.aClass126_Sub3_39.aBoolean673) {
			this.aClass300_4 = Static96.method1439("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass126_Sub3_39);
			this.aClass300_2 = Static96.method1439("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass126_Sub3_39);
			this.aClass300_3 = Static96.method1439("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass126_Sub3_39);
			this.aClass300_5 = Static96.method1439("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass126_Sub3_39);
			if (this.aClass300_5 != null & this.aClass300_3 != null & this.aClass300_4 != null & this.aClass300_2 != null) {
				this.aClass24_Sub4_1 = new Class24_Sub4(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass24_Sub4_1.method6792(false, false);
				this.aBoolean533 = true;
			} else {
				this.aBoolean533 = false;
			}
		} else {
			this.aBoolean533 = false;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V")
	public void method5689() {
		if (!this.aBoolean532) {
			return;
		}
		@Pc(6) int local6 = super.aClass126_Sub3_39.XA();
		@Pc(10) int local10 = super.aClass126_Sub3_39.i();
		@Pc(21) float local21 = (float) local6 - (float) (local6 - local10) * 0.125F;
		@Pc(32) float local32 = (float) local6 - (float) (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local32, local21, 1.0F / (float) super.aClass126_Sub3_39.anInt8287, (float) super.aClass126_Sub3_39.anInt8297 / 255.0F);
		super.aClass126_Sub3_39.method7104(1);
		super.aClass126_Sub3_39.method7125(super.aClass126_Sub3_39.anInt8288);
		super.aClass126_Sub3_39.method7104(0);
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(B)V")
	public void method5691() {
		@Pc(11) Class117_Sub3 local11 = super.aClass126_Sub3_39.aClass117_Sub3_4;
		if (this.aBoolean535) {
			OpenGL.glBindProgramARB(34336, super.aClass126_Sub3_39.anInt8309 == Integer.MAX_VALUE ? this.aClass300_2.anInt8054 : this.aClass300_5.anInt8054);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass126_Sub3_39.anInt8309 == Integer.MAX_VALUE ? this.aClass300_4.anInt8054 : this.aClass300_3.anInt8054);
		}
		local11.method7264(0.0F, (float) super.aClass126_Sub3_39.anInt8309, -1.0F, 0.0F, Static33.aFloatArray2);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static33.aFloatArray2[0], Static33.aFloatArray2[1], Static33.aFloatArray2[2], Static33.aFloatArray2[3]);
		OpenGL.glEnable(34336);
		this.aBoolean532 = true;
		this.method5689();
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8518(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V")
	@Override
	public void method8516() {
		if (this.aBoolean532) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean532 = false;
		}
		super.aClass126_Sub3_39.method7104(1);
		super.aClass126_Sub3_39.method7113((Class24) null);
		super.aClass126_Sub3_39.method7082(8448, 8448);
		super.aClass126_Sub3_39.method7135(768, 5890, 0);
		super.aClass126_Sub3_39.method7135(770, 34166, 2);
		super.aClass126_Sub3_39.method7073(0, 5890);
		super.aClass126_Sub3_39.method7104(0);
		if (this.aBoolean534) {
			super.aClass126_Sub3_39.method7135(768, 5890, 0);
			super.aClass126_Sub3_39.method7073(0, 5890);
			this.aBoolean534 = false;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8519() {
		return this.aBoolean533;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BILclient!iga;)V")
	@Override
	public void method8522(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		if (arg1 != null) {
			if (this.aBoolean534) {
				super.aClass126_Sub3_39.method7135(768, 5890, 0);
				super.aClass126_Sub3_39.method7073(0, 5890);
				this.aBoolean534 = false;
			}
			super.aClass126_Sub3_39.method7113(arg1);
			super.aClass126_Sub3_39.method7105(arg0);
		} else if (!this.aBoolean534) {
			super.aClass126_Sub3_39.method7113(super.aClass126_Sub3_39.aClass24_Sub4_2);
			super.aClass126_Sub3_39.method7105(1);
			super.aClass126_Sub3_39.method7135(768, 34168, 0);
			super.aClass126_Sub3_39.method7073(0, 34168);
			this.aBoolean534 = true;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(III)V")
	@Override
	public void method8520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8521(@OriginalArg(0) boolean arg0) {
		this.aBoolean535 = arg0;
		super.aClass126_Sub3_39.method7104(1);
		super.aClass126_Sub3_39.method7113(this.aClass24_Sub4_1);
		super.aClass126_Sub3_39.method7082(7681, 34165);
		super.aClass126_Sub3_39.method7135(768, 34166, 0);
		super.aClass126_Sub3_39.method7135(770, 5890, 2);
		super.aClass126_Sub3_39.method7073(0, 34168);
		super.aClass126_Sub3_39.method7104(0);
		this.method5691();
	}
}
